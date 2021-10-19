### CRUD Base for Java Application


## This project contains a basic crud structure that can be used in many projects.

## How to use

1. Create a object that implement BaseModel

2. Create a interface in repository package that extends BaseRepository

3. Create a interface in service package that extends BaseService

4. Create a private class in service impl package that extends AbstractCrudBaseService and implements your service interface

5. Your service interface now has all crud methods available for use on your object

6. If you need new logic methods, create them in your service interface, implement them in your interface's implementation class

7. In your implementation class you have the following methods available to control the events that occur before and after each crud action
	 * beforeSave ~ afterSave
	 * beforeUpdate ~ afterUpdate
	 * beforeDelete ~ afterDelete
