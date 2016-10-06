java-MVC-app

A small Java application to show the MVC architectural pattern as follows:

Model: contains the classes which correspond to the problem
entities. Those classes can either form a hierarchy or implement the
same interface.

Repository: is a in-memory repository. It uses fixed size
array to implement the collection of the problem entities.

Controller: implements the functionality required by the problem
and the operations to add and remove entities from the repository. It
maintains a reference to the repository. The reference type is an
interface such that we can easily replace the repository
implementation.

View: consists of an text interface with the following
functionalities: input an entity from the keyboard, delete an entity
and the main functionality which solve the problem.