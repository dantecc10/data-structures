#!/bin/bash

# Default code path:
CODE_PATH="coding/practices/"


# Receive custom code path as a parameter:
if [ -n "$1" ]; then
    CODE_PATH="$1"
fi

if [ -d "$CODE_PATH" ]; then
    echo "Code path is valid ($CODE_PATH)"
else
    echo "Invalid code path: $CODE_PATH"
fi

# Receive file name as a parameter:
if [ -n "$2" ]; then
    FILE_NAME="$2"
else
    echo "No file name provided. Using default: 'Main.java'"
    FILE_NAME="Main"
fi

# Compile the Java file
javac "$CODE_PATH$FILE_NAME.java"

# If compilation is successful, and user wants to run the program
if [ $? -eq 0 ]; then
    echo "Compilation successful."
    if [ "$3" == "--run" ]; then
        echo -e "Running the $CODE_PATH$FILE_NAME program... \n\n"
        java "$CODE_PATH$FILE_NAME"
    fi
else
    echo "Compilation failed."
fi

# Example of call with default path
# ./java-cmpexec.sh 
# ./java-cmpexec.sh /path/to/code/ MyClass --run

#javac coding/practices/Stack.java && java coding/practices/Stack