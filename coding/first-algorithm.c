# include <stdio.h>

int stack[100], tope = 0, element, maximum = 99;

void push (int value){
    if (!full()) {
        tope++;
        stack[tope] = value;
    } else {
        printf("\nPila llena\n");
    }
}

int pop(){
    if(!empty()){
        int value = stack[tope];
        tope--;
        return value;
    } else {
        printf("\nPila vacia\n");
        return -1;
    }
}

int top(){
    if(!empty()){
        return stack[tope];
    } else {
        printf("\nPila vacia\n");
        return -1;
    }
}

int full() {
    return (tope == maximum);
}

int empty(){
    return (tope == 0);
}

int main() {
    return 0;
}