if __name__ == "__main__":
    str = input().strip()
    s1 = str[1:] + str[:1]
    s2 = str[-1:] + str[:-1]
    if s1 == s2:
        print(1)
    else:
        print(0)
