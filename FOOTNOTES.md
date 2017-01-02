On optional creation methods:
- Optional.empty()
    - Takes no parameters. Will always be empty
- Optional.of() 
    - Takes one parameter (anything goes, from Objects to String to ints)
    - Can not handle null. Only use this if you are sure that your are not passing null.
- Optional.ofNullable()
    - Similar to .of(), but CAN handle nulls (this will basically result in an Optional.empty())