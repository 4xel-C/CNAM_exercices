"""
##Dans ce TP, nous allons passer de la base 10 à la base 2, puis à la base 16
##puis n'importe quelle base
##
##Rappels de maths   n^0=1     n^1=n     n^p = n * (n^(p-1))
##0) (re)faire une fonction puissance(n,p) qui fait ce que fait la fonction
##python n**p mais sans l'utiliser

##0 suite) petits tests sur les chaines de caractères :
chaine = "BTS SIO"
taille = len(chaine)
print("taille =",taille,"initiale =",chaine[0])
for i in range(taille):
  print(chaine[i],"-",end="")  #l'option end demande de ne rien faire après le print
nombre = "324"
t=len(nombre)
print("\n taille=",t)
for car in nombre:
  print(car, "/", int(car)+2)

##Rappels de maths : le changement de base
##1011(en binaire)  1 x 2**0 + 1 x 2**1 + 0 x 2² + 1 x 2**3
##5642(en base 10) = 2*1 + 4*10 + 6*100 + 5*1000
##BA45(en hexa)  5 x 16**0 + 4 x 16**1 + 10 x 16² + 11 x 16**3

##1) fonction : retourner la valeur en base 10 d'un nombre passé en base 2
##Par exemple getBase10("100") retourne 4
##2) bonus : procédure : afficher en base 2 un nombre n (en base 10)
##Par exemple afficherBase2(4) affiche "100"
##3) fonction : retourner le nombre en base 2 calculé en (2) plutôt que de l'afficher

##Pour information, vous pouvez utiliser les méthodes ord(lettre) et chr(nombre) pour
##transformer un nombre en caractère. Par exemple, ord('A')=65 et
##chr(65)='A' ; ord('a')=97 et chr(97)='a'
##4) fonction : faire une fonction qui transforme un chiffre (un seul caractère) hexa ("0..9A..F")
##en un nombre en base 10 (situé entre 0 et 15)
##5) fonction : faire une fonction qui transforme un nombre en base 10 (0..15)
##en un chiffre hexa ("0..9A..F")
##6) fonction : écrire une fonction qui retourne la valeur en base 10 (10) d'un nombre en hexa ("A31")
##7) fonction qui retourne la valeur en hexa d'un nombre en base 10
##8) fonction : faire une fonction qui transforme un chiffre en base N ("0..9A..Za..z")
##en un nombre en base 10 (0..N-1)
##9) fonction qui transforme un nombre en base 10 (0..N-1)
##en un chiffre en base N ("0..9A..Za..z")
##10) fonction qui retourne la valeur en base 10 d'un nombre en base N
##11) fonction qui retourne la valeur en base N d'un nombre en base 10
##12) fonction qui retourne la valeur en base N d'un nombre en base M
"""


def getBase10(binary: str) -> int:
    reversed_binary = binary[::-1]
    result = 0

    # iterate through all bits starting from the end
    for i, bit in enumerate(reversed_binary):
        result = result + (2**i * int(bit))

    return result


def getBase2(num: int) -> str:
    result = ""

    while num > 0:
        if num % 2 == 1:
            result = "1" + result
        else:
            result = "0" + result

        num //= 2

    return result


def hexa_digit_to_int(char: str) -> int:
    if char.isdigit():
        return int(char)
    else:
        return ord(char) - 55


def hexa_to_num(hexa: str) -> int:
    reversed_hexa = hexa[::-1]

    result = 0

    for i, char in enumerate(reversed_hexa):
        result += 16**i * hexa_digit_to_int(char)

    return result


def num_to_hexa(num: int) -> str:
    result = ""

    while num > 0:
        hexa = num % 16

        if hexa >= 10:
            result = chr(hexa + 55) + result
        else:
            result = str(hexa) + result

        num //= 16

    return result


def N_to_num(str_num: str, base: int) -> int:
    reversed_str = str_num[::-1]

    result = 0

    for i, char in enumerate(reversed_str):
        if char.isdigit():
            result += base**i * int(char)
        else:
            result += base**i * (ord(char) - 55)

    return result


if __name__ == "__main__":
    print(getBase10("100"))

    print(getBase2(5))

    print(hexa_digit_to_int("F"))

    print(hexa_to_num("AF"))

    print(num_to_hexa(175))

    print(N_to_num("13EA", base=15))
