#Optional states:
- Optionals are either 'Present' (aka they contain a value) or 'Absent' (they do not contain a value). 
- An Absent Optional is NOT the same as null. 
- An Optional is Nullable (eg: Optional<String> myOpt = null), but doing this is considered an antipattern.
#On optional creation methods:
- Optional.empty()
    - Takes no parameters. Will always be empty
- Optional.of() 
    - Takes one parameter (anything goes, from Objects to String to ints)
    - Can not handle null. Only use this if you are sure that your are not passing null.
- Optional.ofNullable()
    - Similar to .of(), but CAN handle nulls (this will basically result in an Optional.empty())
#Extra functionalities coming in Java 9
- Optional.stream()
    - Can be used in a regular stream in combination with a .flatmap() call to bundle ".filter(Optional::isPresent)" and ".map(Optional.get)"
- Optional.ifPresentOrElse(Consumer<T>, Runnable)
    - Calls consumer on present value, calls runnable if absent
- Optional.or(Supplier<Optional<T>>)
    - if Optional is Present, return it. Else call Supplier method (that has to return an Optional)
#Optionals in all the wrong places
Try to avoid using Optionals in:
- class fields: Fields should be private. Getters for these fields can return an Optional version of the field if you know it might be empty
- method parameters: Possible Optional values should be unpacked before being passed as a parameter to a function. Otherwise caller is forced to box every object in an Optional if he wants to call a method. It's better to have multiple overloaded functions than having a function with an Optional parameter
- collections: A collection of Optional should be mapped to concrete Objects/primitive types asap so you know what you're dealing with
