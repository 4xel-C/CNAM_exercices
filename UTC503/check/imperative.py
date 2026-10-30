"""
##Les instructions suivantes permettent de tirer
##un nombre au hasard entre 1 et 1000 inclus
import random
print(random.randint(1,1000))

##Ecrire une méthode, une fonction tirer(mini, maxi) qui tire un nombre
##au hasard entre mini et maxi

##Ecrire une méthode, une fonction tirerD6 qui fait tirer un dé à 6 faces

##Ecrire une boucle de 100 tests de la fonction tirer
##Elle affiche False si la valeur aléatoire tirée n'est pas comprise
##dans l'intervalle souhaité et affiche la valeur obtenue quand
##celle-ci est une des valeurs extrêmes

##Faire une méthode, une fonction, qui lit un nombre saisi au clavier
int(input("entrez un nombre"))

##Faire une méthode, une fonction, comparer(nombre, cible) qui retourne une chaine de caractères
##indiquant si la cible est "plus petit" "plus grand" ou "égal" à nombre

##Plus ou moins ?
##Faire une méthode qui tire un nombre cible au hasard sur
##un intervalle donné puis demande à un joueur un nombre pour lui indiquer si
##la cible est plus petite ou plus grande que sa proposition.

##Faire une procédure qui boucle jusqu'à ce que la cible ait été trouvée

##Faire une fonction qui retourne, en plus, le nombre de tentatives effectuées

##Faire une procédure qui recherche par dichotomie la valeur tirée au hasard sur
##un intervalle donné en affichant chaque proposition faite et en affichant
##le nombre d'essais.

##Bonus, regarder combien de coups, en moyenne, le programme utilise pour
##trouver la réponse. Tester sur 100000 parties.
"""

import random


def tirer(mini: int, maxi: int) -> int:
    return random.randint(mini, maxi)


def tirer_d6() -> int:
    return random.randint(1, 6)


def read_input() -> int:
    number = input("Entrez un nombre: ")
    print(number)
    if not number.isdigit:
        print("Wrong number")
        return 0
    return int(number)


def comparer(num: int, target: int) -> int:
    if num < target:
        print("Plus petit")
        return -1
    elif num > target:
        print("Plus grand")
        return 1
    else:
        print("Egal!")
        return 0


def random_compare(num: int):
    target = random.randint(1, 100)

    comparer(num, target)


def find_random_target():
    target = random.randint(1, 100)
    target_found = 0

    tries = 0

    while not target_found:
        user_num = read_input()

        if comparer(user_num, target) == 0:
            target_found = 1
        tries += 1

    print(f"Target trouvé en {tries} essais!")
    return tries


def dichotomic_search(mini: int, maxi: int) -> int:
    target = random.randint(mini, maxi)

    left = mini
    right = maxi
    mid = (maxi + mini) // 2
    tries = 1

    while mid != target:
        print("Testing ", mid)
        if mid < target:
            left = mid + 1
        else:
            right = mid - 1

        mid = (left + right) // 2
        tries += 1

    print("Target trouvé: ", mid, " en ", tries, " coups!")
    return tries


if __name__ == "__main__":
    mean_tries = 0

    iterations = 10_000

    for _ in range(10_000):
        tries = dichotomic_search(1, 1000)
        mean_tries = mean_tries + (tries / iterations)

    print(mean_tries)
