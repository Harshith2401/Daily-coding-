pan = input()
if len(pan) == 10:
    if pan.isupper() and pan[0:5].isalpha() and pan[5:9].isdigit() and pan[9].isalpha():
        print("Valid Pan")
    else:
        print("Invalid pan")
else:
    print("Invalid pan")
