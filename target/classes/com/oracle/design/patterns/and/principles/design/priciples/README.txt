Important Java design principles:
- encapsulate data (private fields, getters, setters)
- JavaBeans (get, set, "is" is used to get a BOOLEAN PRIMITIVE)
- inheritance (IS-A relationship, a Mercedes is a Car is a Vehicle (all children share the same properties))
- composition (HAS-A relationship, a Mercedes has a DVD player)

encapsulation:
an invariant is a property or truth that is maintained even after the object is modified
this is validated in the setters, when a condition is not met you can throw a new IllegalArgumentException
for example: the field age must be bigger than 18

composition:
a composite class has references to other classes
composition promotes greater code reuse than inheritance
composition delegates the heavy work to the other classes
you have a "frontend class" and "backend classes"