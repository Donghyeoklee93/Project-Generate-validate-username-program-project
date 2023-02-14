Project Name : Generate/validate username program project 
Description : 

Develop an application to generate usernames for their employees’ accounts. The application prompts the user to provide one single line of text with an employee’s full name in the following format “forename surname” at a time. Next, the application uses the given full name to generate/create the corresponding username. The username is created using several rules. 

[Rule]
Given a full name with the following format : forename surname

The username is generated from the given full name as follows:
a)	The username starts with the last letter of the forename followed by the last letter of the surname, written using the same letter case as in the given full name.

Then the rest of the username is generated from the given full name as follows:
b)	Each upper case vowel is added twice to the username
c)	The space is eliminated
d)	Apart from the above-mentioned letters and characters, all the other letters should be copied unchanged to the username from the given full name
e)	The username ends with the total number of upper case vowels contained in the generated username (here should be included the number of all the upper case vowels added due to the above-mentioned rules i.e. rules a) and b))


Ask the user to provide a full name and after the corresponding username is generated and displayed on the screen, ask the user if they would like to generate another username. As long as the user enters “yes” the application should work as described in the previous sentence. When the user enters anything else than “yes”, no other items are created.
