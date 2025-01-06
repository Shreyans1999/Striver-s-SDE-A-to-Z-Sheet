def main():
    # Numeric Types
    int_var = 100  # Integer
    float_var = 3.14  # Floating-point
    complex_var = 2 + 3j  # Complex number

    # Sequence Types
    string_var = "Hello, Python!"  # String
    list_var = [1, 2, 3, 4, 5]  # List
    tuple_var = (1, 2, 3, 4, 5)  # Tuple
    range_var = range(1, 6)  # Range

    # Set Types
    set_var = {1, 2, 3, 4, 5}  # Set
    frozenset_var = frozenset([1, 2, 3, 4, 5])  # Frozenset (immutable set)

    # Mapping Type
    dict_var = {"name": "Viru", "age": 25}  # Dictionary

    # Boolean Type
    bool_var = True  # Boolean

    # None Type
    none_var = None  # None

    # Displaying data types and values
    print("int:", int_var)
    print("float:", float_var)
    print("complex:", complex_var)
    print("string:", string_var)
    print("list:", list_var)
    print("tuple:", tuple_var)
    print("range:", list(range_var))
    print("set:", set_var)
    print("frozenset:", frozenset_var)
    print("dict:", dict_var)
    print("bool:", bool_var)
    print("none:", none_var)

if __name__ == "__main__":
    main()
