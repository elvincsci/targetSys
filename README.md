
This java program is used to get all files in a mount point their disk usage.

Program
This program is make up of two files: DiskUsage, and SystemDriver. In order to run the program use SystemDriver.java and pass in
one argument, the mount point. For example "\users"

Provided the correct input the program will return a list of all the files on the mountpoint and their disk usage in
bytes in json format.

example


	"files": [{
		"\/Users\/elvin\/Music": 128
	} {
		"\/Users\/elvin\/.anyconnect": 583
	}, {
		"\/Users\/elvin\/VirtualBox VMs": 128
	} ]
    }

Known issue:

When creating the json the an escape character is add "\" whenever a "/" is found. 
Tried using replace and replaceall without any success. Simple script is being developed in python.