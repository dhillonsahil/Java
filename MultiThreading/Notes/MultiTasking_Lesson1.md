# Multithreading 
Before Learning multi threading we need to learn some things :-

As we know we performs some tasks with the help of computer.
>Task -> Activity / piece of work

Programs are first loaded in the RAM and then the instruction is sent to the processor. The tasks are executed by the processor but they are executed in the RAM.

![Multi tasking](https://github.com/dhillonsahil/Java/blob/main/MultiThreading/Notes/Processbased.jpg "Multi tasking")

When there are multiple activities suppose we are attending live video class on zoom , making some notes on Notepad (2nd task) and Replying some one on whatsapp (3rd task).

many ( multiple ) tasks are getting performed at same time and this is done by the Operating System(Os). 
The os which can perform multiple tasks at the same time is called multi tasking os.

>Many task -> Multi tasking

## Operating System
It is a System Software which runs in the background and helps the user to run another applications.

> exectuing serveral tasks together is the concept of Multi tasking.

## Types of Multi tasking
Multi tasking is of Two types
1. Process based Multi tasking
1. Thread Based Multi tasking

### 1. Process Based Multi tasking.
This is performed at the Os level. the os is resposible for this multi tasking.

> **Context Switching** :- The process of switching from one task or activity to another. example :- switching from zoom to notepad to make notes and then from notepad to whatsapp.

* Process base multi tasking is dont by os to satisfu users requirement.

* It  Is a heavy weight process.

* We can call an application a process. each application is a Process Load. so in the above example we have 3 work loads.

> **Definition** :- Executing several tasks simultaneously where each task is a seperate independent Process such type of multi tasking is called Process Basde Multitasking.

### 2. Thread Based Multi tasking

If in a Single Process (application) there are multiple tasks.

example :- In zoom we are watching the live video of class , simultaneously we are chatting with others and reading their messages.

>**Definition** :- Executing Several task Simultaneously where each task is a seperate independent part of the same Program is called "Thread Based multitasking" 
> * Each independent part is called a "thread" 
