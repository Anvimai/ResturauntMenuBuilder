# Assignment 5 

## Novice

Create eight classes which implement the ```Ingredient``` interface called ```Avocado```, ```Crab```, ```Eel```, ```Rice```, ```Yellowtail```, ```Seaweed```, ```Shrimp```, and ```Tuna```. The characteristics of these classes are given in the following table:

| Class Name | Name | Price/Oz. | Calories/Oz. | Vegetarian? | Rice? | Shellfish? |
|------------|------|-----------|--------------|-------------|-------|------------|
| Avocado	| "avocado"	| $0.24 |	42	| true | false | false |
| Crab	| "crab" | $0.72 | 37 | false | false | true |
| Eel	| "eel"	| $2.15 | 82 | false | false | false |
| Rice	| "rice" | $0.13 | 34 | true | true | false |
| Yellowtail | "yellowtail" | $0.74 | 57 | false | false | false |
| Seaweed	| "seaweed"	| $2.85 | 105 | true | false | false |
| Shrimp | "shrimp" | $0.65 | 32 | false | false | true |
| Tuna	| "tuna"	| $1.67 | 42	| false	| false	| false |


## Adept

Create the following three classes which implement the Sushi interface.

### Sashimi

A piece of sashimi is comprised of 0.75 ounces of some type of seafood. There are five types of sashimi: tuna, yellowtail, eel, crab, and shrimp. The ```Sashimi``` class should define a public enumeration called ```SashimiType``` with the following definition:


### Nigiri

A piece of nigiri is comprised of 0.75 ounces of some type of seafood and 0.5 ounces of rice. There are five types of nigiri: tuna, yellowtail, eel, crab, and shrimp. The ```Nigiri``` class should define a public enumeration called ```NigiriType``` with the following definition:

### Roll

A roll is a sushi creation that may be comprised of any number of different ingredient portions. The ```Roll``` class should have a constructor with the following signature:

## Jedi

The constructor should detect if a particular ingredient type is repeated and combine the separate portions of a repeated ingredient type into a single portion.
