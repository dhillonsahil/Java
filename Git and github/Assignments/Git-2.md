# Question 1. How to Check if git is available in your system ?
> if git is installed we will find 3 programs by filenames git bash
, git ui and git cmd. And we can also check by using git version or git –
version in cmd.
___
# Question 2. How to initialize a new git repository?
> Use the git init command to initialize a git repository.
___
# Question 3. How to tell git about your name and email ?
We will use the following command to add username and
email :-
```bash
git config --global user.name “SAHIL”
git config --global user.email “testgithub@gmail.com”
```
___
# Question 4. How to add a file to the staging area ?
To add a file to the staging area we will use the git add
command. Example git add PrimeNumberCheck.java

___
# Question 5. How to remove a file from the staging area ?
File in the staging area can be removed by git rm
FileName.java --cached
___
# Question 6. How to make a commit ?
to make a commit we will use the 
```bash
git commit command –m
“Commit message to be entered here”
```
Add commit message otherwise maybe you will face error.
___
# Question 7. How to send your changes to a remote repository ?
to make changes to a remote repository we need to use:-
```bash
git commit origin main
https://github.com/dhillonsahil/JavaProgramsPractice.git
```
# Question 8. What is the difference between clone and pull ?
Clone copies the entire repository and pull brings the new
changes only that was done in remote repo