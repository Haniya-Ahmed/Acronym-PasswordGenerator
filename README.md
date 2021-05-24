# Acronym-PasswordGenerator
# StepTrackerApp
This was created for CS1073 Introduction to Java class. 
This is a javaFX based GUI application that can be used to generate acronym and password based on some rules:
When building the acronym, we take the first letter of any words (tokens) that are capitalized, and any words (tokens) that start with a digit are kept. All other tokens are ignored. 
When building the password, we take the last two characters of the first word (token) with all letters converted to upper-case, followed by the first two characters of the next word (token) with all letters converted to lower-case, and so forth (the pattern repeats). This is done ONLY for words that have 3 or more characters; any words with fewer
than 3 characters are simply skipped.
