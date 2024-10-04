This project is the implementation of the projection and traduction described in "Global Types for Agent Interaction Protocols" presented at the 2024 ICTCS conference https://ictcs2024.di.unito.it.

The full version is available at this link: https://drive.google.com/file/d/17BsoRcDP1gvcwYO_94my5wZ5TBP7T628/view?usp=sharing, here are defined the projection rules and are present examples.

THIS IS A WORK IN PROGRESS

HOW TO RUN

1- Download this archive 

2- Open Eclipse, go to Help -> Install New Software

3- Click Add -> Archive, select the donloaded archive and Open

4- Insert a name and Add

5- "Translation" should appear, if not check that "Group items by category" is unchecked

6- Select Traslation, click Next and Finish

7- Accept the Terms, Trust the Content

8- Eclipse will Restart, after that create a project

9- Inside src/, create a .jglobal file, when asked to configure Xtext select Yes


You can now write a global (or local) protocol inside the .iglobal file. When saved, it will create in src-gen/local the local types.
Open these, modify something (add and remove a space) and save. The Jadescript structure will be created in src-gen
