# -*- coding: utf8 -*-
from turtle import done, forward, goto, left, pendown, penup, right, speed

print("exercice de la tortue")

##https://docs.python.org/3.3/library/turtle.html
##forward(PAS)
##pendown()
##penup()
##right(DEGRES)
##left(DEGRES)
##color('red', 'yellow')

## utiliser speed(0) pour aller le plus rapidement possible

##********** Dessin avec la turtle niveau 1
##lettres et mot.  I L T          TILT

## Dessiner un rectangle creux
## Dessiner un rectangle plein
##* * * * * * *         * * * * * * *
##* * * * * * *         *           *
##* * * * * * *         *           *
##* * * * * * *         * * * * * * *

##Faire une procédure pour dessiner un triangles isocèle
##rectangle de hauteur h (exemple 5)
##* * * * *
##* * * *
##* * *
##* *
##*

##Faire deux procédures pour dessiner des triangles isocèles
##rectangle de hauteur h (exemple 5)
##* * * * *
##  * * * *
##    * * *
##      * *
##        *
##de longueur l (exemple 9)
##* * * * * * * * *
##  * * * * * * *
##    * * * * *
##      * * *
##        *

##Faire deux procédures qui dessinent un carré plein ou un carré creux
##(réutilisez votre travail).

##Dessiner un losange selon sa largeur (ici 6 ou 7 à gauche, 8 ou 9 à droite)
##   *         *
##  ***       ***
## *****     *****
##*******   *******
## *****   *********
##  ***     *******
##   *       *****
##            ***
##             *

## Dessiner un cercle selon son périmètre, en n'utilisant que forward et right

##BONUS : Dessiner un sapin (marron et vert ?)
##    exemple hauteur = 4
##      hauteur du pied et d'un bloc : 40
##      hauteur du sommet : 40
##      nombre de blocs : 4
##
##        *
##       ***
##      *****      dessinerBloc(XXXXX)
##     *******     largeur = 70
##       ***
##      *****
##     *******     dessinerBloc(XXXXX)
##    *********    largeur = 90
##      *****
##     *******
##    *********    dessinerBloc(XXXXX)
##   ***********   largeur = 110
##     *******
##    *********
##   ***********   dessinerBloc(XXXXX)
##  *************  largeur = 130
##      *****
##      *****      dessinerTronc(hauteur)
##      *****      largeur = 50 (ou vous pouvez prendre d'autres proportions)
##      *****

##    exemple hauteur = 3
##      hauteur du pied et d'un bloc : 30
##      hauteur du sommet : 30
##      nombre de blocs : 3
##
##        *
##       ***
##      *****      dessinerBloc(XXXXX)  largeur = 50
##       ***
##      *****
##     *******     dessinerBloc(XXXXX)  largeur = 70
##      *****
##     *******
##    *********    dessinerBloc(XXXXX) largeur = 90
##       ***
##       ***       dessinerTronc(hauteur)
##       ***       largeur = 30

##    exemple hauteur = 2
##      hauteur du pied et d'un bloc : 20
##      hauteur du sommet : 20
##      nombre de blocs : 2
##
##        *
##       ***       dessinerBloc(XXXXX)  largeur = 30
##       ***
##      *****      dessinerBloc(XXXXX)  largeur = 50
##        *        dessinerTronc(hauteur) largeur = 10


speed(0)


def bougeLaTortuePourVerifierLeDessin():
    penup()
    forward(100)


# Draw ILT / TILT


def dessiner_lettres(letters: str, x=0, y=0):
    letters = letters.upper()

    # x, y mapping of letters
    letter_coord = {
        "I": [
            ((0, 100), (50, 100)),  # move right
            ((25, 100), (25, 0)),  # Move down
            ((0, 0), (50, 0)),
        ],
        "L": [((0, 100), (0, 0)), ((0, 0), (50, 0))],
        "T": [((0, 100), (50, 100)), ((25, 100), (25, 0))],
    }

    for letter in letters:
        if letter not in letter_coord:
            print(f"Letter {letter} not implemented")
        else:
            for start, stop in letter_coord[letter]:
                penup()
                xstart, ystart = start
                goto(x + xstart, y + ystart)
                pendown()
                xstop, ystop = stop
                goto(x + xstop, y + ystop)
            penup()
            x += 75  # move of 75 pixels to draw another leter


def ligne_forward(size=50, x=0, y=0):
    goto(x, y)
    pendown()
    forward(50)
    penup()
    goto(x, y - 1)


def rectangle_creux(L=300, l=200, x=0, y=0):
    goto(x, y)
    pendown()
    for i in range(4):
        if i % 2 == 0:
            forward(L)
        else:
            forward(l)
        right(90)
    penup()


def rectangle_plein(L=300, l=200, x=0, y=0):
    for i in range(l):
        goto(x, y - i)
        pendown()
        forward(L)
        penup()


def triangle_isocele_L(h=50, x=0, y=0):
    for i in range(h):
        goto(x, y - i)
        pendown()
        forward(h - i)
        penup()


def triangle_isocele_R(h=50, x=0, y=0):
    for i in range(h):
        goto(x + i, y - i)
        pendown()
        forward(h - i)
        penup()


def triangle_down(l=None, h=None, x=0, y=0):
    # largeur
    if l is not None:
        for i in range(l // 2):
            goto(x + i, y - i)
            pendown()
            forward(l - 2 * i)
            penup()

    # hauteur
    elif h is not None:
        for i in range(h):
            goto(x + i, y - i)
            pendown()
            forward(2 * (h - i))
            penup()


def triangle_up(l=None, h=None, x=0, y=0):
    penup()
    # largeur
    if l is not None:
        for i in range(l):
            goto(x + (l // 2 - i), y - i)
            pendown()
            forward(2 * i)
            penup()

    # hauteur
    elif h is not None:
        for i in range(h):
            goto(x + h - i, y - i)
            pendown()
            forward(2 * i)
            penup()


triangle_up(h=120)


done()
