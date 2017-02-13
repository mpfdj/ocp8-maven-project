Things you can't do with generics:
- You can't call the constructor. new T() is not allowed because at runtime it would be new Object().
- You can't create an array of a generic type. Because it would just be an array of Objects.
- You can't call instanceof. Because at runtime List<Integer> and List<String> would be the same due type erasure.
- You can't pass a primitive as a generic type argument. Use the wrapper classes instead.
- You can't define a generic type as a static field