# Project: Translation from global types to Jadescript agents

This project is the implementation of translation from the Multiparty Global Types defined in "Global Types for Agent Interaction Protocols", presented at the 2024 ICTCS conference https://ictcs2024.di.unito.it, to Jadescript agents.

The formal definition of the projection from Global Types to Session Types can be found at: https://drive.google.com/file/d/17BsoRcDP1gvcwYO_94my5wZ5TBP7T628/view?usp=sharing, where we also present some examples.

A paper defining the translation from Session Types to Jadescript agents and proving its correctness is in preparation.

THIS IS A WORK IN PROGRESS

HOW TO RUN

1- Dowload the projects in a selected folder.

2- Use the Eclipse IDE with the Xtext plugin installed. Import with "Import Projects from File System or Archive", select the folder containing all the projects, open all the projects.

3- Go to org.xtext.example.mydsl and open META-INF, select Overview, in the Testing section select Launch an Eclipse application.

4- Now create a *.jglobal file, write the protocol, and save. If the protocol passed validatin, in the src-gen folder a local directory was created. It contains the Local Protocols for each role part of the protocol.

5- Modify the Local Protocol and save to generate *.jade files, containing jadescript code. It is now necessary to copy the snippets of code in a Jadescript project.


EXAMPLES

Some examples of global types and generated code can be found in the folder Examples. 

# Authors

* Leonardo Gallieri - [University of Eastern Piedmont](https://www.uniupo.it/en)
* Riccardo Nazzari - [University of Eastern Piedmont](https://www.uniupo.it/en)
* [Paola Giannini](https://people.unipmn.it/giannini/) - [University of Eastern Piedmont](https://www.uniupo.it/en)

# Acknowledgments
This work is supported by the MIUR project ["T-LADIES" under grant PRIN 2020TL3X8X](https://cazzola.di.unimi.it/t-ladies.html).

