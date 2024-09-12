This project is the implementation of the projection and traduction described in "Global Types for Agent Interaction Protocols" presented at the 2024 ICTCS conference https://ictcs2024.di.unito.it.

The full version is available at this link: https://drive.google.com/file/d/17BsoRcDP1gvcwYO_94my5wZ5TBP7T628/view?usp=sharing, here are defined the projection rules and are present examples.

THIS IS A WORK IN PROGRESS

HOW TO RUN

1- Dowload the projects in a selected folder.

2- Use the Eclipse IDE with the Xtext plugin installed. Import with "Import Projects from File System or Archive", select the folder containing all the projects, open all the projects.

2.1- Building the language artifacts may be needed. Go to /org.xtext.example.mydsl/src/org/xtext/globalTypes/MyDsl.xtext, right click, Run As, Generate Xtext Artifacts.

3- Go to org.xtext.example.mydsl and open META-INF, select Overview, in the Testing section select Launch an Eclipse application.

4- Now create a *.jglobal file, write the protocol, and save. If the protocol passed validatin, in the src-gen folder a local directory was created. It contains the Local Protocols for each role part of the protocol.

5- Modify the Local Protocol and save to generate *.jade files, containing jadescript code. It is now necessary to copy the snippets of code in a Jadescript project.
