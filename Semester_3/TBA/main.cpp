#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
    int token[50];
    string input;
    int i,j,a,b;
    bool cek,valid;
    cout<<"input data : ";
    getline(cin,input);
    a = input.length();
    i = 0;
    j = 0;
    b = 0;
    while (input[i]!=' ' && input[i]!= NULL && i<=a && cek )
    {
        if (input[i]=='p' || input[i]=='q' || input[i]=='r'|| input[i]=='s' || input[i]=='P' || input[i]=='Q' || input[i]=='R' || input[i]=='S'){
            i++;
            if (input[i]==' '||input[i]== NULL){
                token[j]=1;
                cout<<token[j]<<" ";
                j++;
                i++;
            } else {
                cout<<"error ";
                cek = false;
            }

        } else if (input[i]=='n' || input[i]=='N'){
            i++;
            if (input[i]=='o' || input[i]== 'O'){
                i++;
                if (input[i]=='t' || input[i]=='T'){
                    i++;
                    if(input[i]==' ' || input[i]== NULL){
                        token[j] = 2;
                        cout<<token[j]<<" ";
                        i++;
                        j++;
                    } else {
                        cout<<"error ";
                        cek = false;
                    }
                } else {
                    cout<<"error ";
                    cek = false;
                }
            } else {
                cout<<"error ";
                cek = false;
            }

        } else if (input[i]=='a' || input[i]=='A'){
            i++;
            if (input[i]=='N' || input[i]=='n'){
                i++;
                if (input[i]=='d' || input[i]=='D'){
                    i++;
                    if (input[i]==' ' || input[i]== NULL){
                        token[j] = 3;
                        cout<<token[j]<<" ";
                        i++;
                        j++;
                    }else {
                        cout<<"error ";
                        cek = false;
                    }
                } else {
                    cout<<"error ";
                    cek = false;
                }
            } else {
                cout<<"error ";
                cek = false;
            }
        } else if (input[i]=='o' ||input[i]=='O'){
            i++;
            if (input[i] == 'r' ||input[i]=='R'){
                i++;
                if(input[i]==' ' || input[i]== NULL){
                    token[j]= 4;
                    cout<<token[j]<<" ";
                    i++;
                    j++;
                } else{
                    cout<<"error ";
                    cek = false;
                }
            } else {
                cout<<"error ";
                cek = false;
            }
        } else if (input[i]=='x' || input[i]=='X') {
            i++;
            if ( input[i]=='o' || input[i]=='O'){
                i++;
                if (input[i]=='r' || input[i]=='R'){
                    i++;
                    if (input[i]==' ' || input[i]== NULL){
                        token[j]=5;
                        cout<<token[j]<<" ";
                        i++;
                        j++;
                    } else {
                        cout<<"error ";
                        cek = false;
                    }
                } else {
                    cout<<"error ";
                    cek = false;
                }
            } else {
                cout<<"error ";
                cek = false;
            }
        } else if (input[i]=='t' || input[i]=='T') {
            i++;
            if (input[i]=='h' || input[i]=='H'){
                i++;
                if (input[i]=='e' ||input[i]=='E'){
                    i++;
                    if (input[i]=='n' || input[i]=='N'){
                        i++;
                        if (input[i]==' ' || input[i] == NULL){
                            token[j]=7;
                            cout<<token[j]<<" ";
                            i++;
                            j++;
                        } else {
                            cout<<"error ";
                            cek = false;
                        }
                    } else {
                        cout<<"error ";
                        cek = false;
                    }
                } else {
                    cout<<"error ";
                    cek = false;
                }
            } else {
                cout<<"error ";
                cek = false;
            }
        } else if (input[i]=='i' || input[i]=='I'){
            i++;
            if (input[i]=='f' || input[i]=='F'){
                i++;
                if (input[i]=='f' || input[i]=='F'){
                    i++;
                    if (input[i]==' ' || input[i]== NULL){
                    token[j]=8;
                    cout<<token[j]<<" ";
                    i++;
                    j++;
                    } else {
                        cout<<"error ";
                        cek = false;
                    }
                } else if (input[i]==' ' || input[i]== NULL){
                    token[j]=6;
                    cout<<token[j]<<" ";
                    i++;
                    j++;
                } else {
                    cout<<"error ";
                    cek = false;
                }
            } else {
                cout<<"error ";
                cek = false;
            }
        }else if (input[i]=='('){
            i++;
            token[j]=9;
            cout<<token[j]<<" ";
            j++;
            if (input[i]==' ')
                i++;
        } else if (input[i]==')'){
            i++;
            token[j]=10;
            cout<<token[j]<<" ";
            j++;
            if (input[i]==' ')
                i++;
        } else {
            cout<<"error ";
            cek = false;
        }
    }
    if (cek == true){
        valid = true;
    } else {
        valid = false;
    }
    // cek valid atau tidak
    if (token[b]==1){           //awalan p,q,r,s
        b++;
        while (b<j && valid == true){
            if(token[b-1]==1){
                if (token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                    b++;
                    if (token[b]==1){
                        valid = true;
                    } else if (token[b]==2){
                        b++;
                        if(token[b]==1){
                            valid = true;
                        } else {
                            valid = false;
                        }
                    } else if (token[b]==9){
                        b++;
                        if (token[b]==1){
                            b++;
                            valid = true;
                            while (b<j-1 && valid == true && token[b]!= 10){
                                if (token[b-1]==1){
                                    if (token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                        b++;
                                        if (token[b]==1){
                                            valid = true;
                                        } else if (token[b]==2){
                                            b++;
                                            if (token[b]==1){
                                                valid = true;
                                            } else {
                                                valid = false;
                                            }
                                        }
                                    }
                                }
                                b++;
                            }
                            if (token[b]==10){
                                valid = true;
                            } else {
                                valid = false;
                            }
                        } else if (token[b]==2) {
                            b++;
                            if (token[b]==1){
                            b++;
                            valid = true;
                            while (b<j-1 && valid == true && token[b]!= 10){
                                if (token[b-1]==1){
                                    if (token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                        b++;
                                        if (token[b]==1){
                                            valid = true;
                                        } else if (token[b]==2){
                                            b++;
                                            if (token[b]==1){
                                                valid = true;
                                            } else {
                                                valid = false;
                                            }
                                        }
                                    }
                                }
                                b++;
                            }
                            if (token[b]==10){
                                valid = true;
                            } else {
                                valid = false;
                            }
                        }

                    } else {
                        valid = false;
                    }
                }
            } else {
                valid = false;
            }
            b++;
        }
        }
    }else if (token[b]==2){                 //awalan not
        b++;
        if (token[b]==1){
            b++;
            while (b<j && valid == true){
                if(token[b-1]==1){
                    if (token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                        b++;
                        if (token[b]==1){
                            valid = true;
                        } else if (token[b]==2){
                            b++;
                            if(token[b]==1){
                                valid = true;
                            } else {
                                valid = false;
                            }
                        }
                         else {
                            valid = false;
                        }
                    }
                } else {
                    valid = false;
                }
                b++;
            }
        }
    } else if (token[b]==6){            //awalan if
        b++;
        if (token[b]==1){
            b++;
            if (token[b]==7){
                b++;
                if (token[b]==1){
                    valid = true;
                    b++;
                } else if (token[b]==2){
                    b++;
                    if (token[b]==1){
                        valid = true;
                        b++;
                    }
                } else if (token[b]==9){
                    b++;
                    if (token[b]==1){
                        b++;
                        while (token[b]!= 10 && b<j-1){
                            if (token[b-1]==1){
                                if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                    b++;
                                    if (token[b]==1){
                                        valid = true;
                                    } else if (token[b]==2){
                                        b++;
                                        if (token[b]==1){
                                            valid ==true;
                                        } else {
                                            valid = false;
                                        }
                                    } else {
                                        valid = false;
                                    }
                                } else {
                                    valid = false;
                                }
                            } else if (token[b-1]==2){
                                b++;
                                if (token[b]==1){
                                    b++;
                                    if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                        b++;
                                        if (token[b]==1){
                                            valid = true;
                                        } else if (token[b]==2){
                                            b++;
                                            if (token[b]==1){
                                                valid = true;
                                            } else {
                                            valid = false;
                                            }
                                        } else {
                                            valid =false;
                                        }
                                    } else {
                                        valid = false;
                                    }
                                } else {
                                    valid = false;
                                }
                            }
                            b++;
                        }
                    }
                } else {
                    valid = false;
                }
            } else {
                valid = false;
            }
        } else if(token[b]==2){
            b++;
            if (token[b]==1){
                b++;
                if (token[b]==7){
                    b++;
                    if (token[b]==1){
                        valid = true;
                        b++;
                    } else if (token[b]==2){
                            b++;
                            if (token[b]==1){
                                valid = true;
                                b++;
                            }
                    } else {
                        valid = false;
                    }
                }
            } else {
                valid = false;
            }
        } else if (token[b]==9){
            b++;
            if (token[b]==1){
                b++;
                while (token[b]!= 10 && b<j-1){
                    if (token[b-1]==1){
                        if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                            b++;
                            if (token[b]==1){
                                valid = true;
                            } else if (token[b]==2){
                                b++;
                                if (token[b]==1){
                                    valid ==true;
                                } else {
                                    valid = false;
                                }
                            } else {
                                valid = false;
                            }
                        } else {
                            valid = false;
                        }
                    } else if (token[b-1]==2){
                        b++;
                        if (token[b]==1){
                            b++;
                            if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                b++;
                                if (token[b]==1){
                                    valid = true;
                                } else if (token[b]==2){
                                    b++;
                                    if (token[b]==1){
                                        valid = true;
                                    } else {
                                    valid = false;
                                    }
                                } else {
                                    valid =false;
                                }
                            } else {
                                valid = false;
                            }
                        } else {
                            valid = false;
                        }
                    }
                    b++;
                }
            } else if (token[b]==2){
                b++;
                if (token[b]==1){
                    b++;
                    while (token[b]!= 10 && b<j-1){
                        if (token[b-1]==1){
                            if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                b++;
                                if (token[b]==1){
                                    valid = true;
                                } else if (token[b]==2){
                                    b++;
                                    if (token[b]==1){
                                        valid ==true;
                                    } else {
                                        valid = false;
                                    }
                                } else {
                                    valid = false;
                                }
                            } else {
                                valid = false;
                            }
                        } else if (token[b-1]==2){
                            b++;
                            if (token[b]==1){
                                b++;
                                if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                    b++;
                                    if (token[b]==1){
                                        valid = true;
                                    } else if (token[b]==2){
                                        b++;
                                        if (token[b]==1){
                                            valid = true;
                                        } else {
                                        valid = false;
                                        }
                                    } else {
                                        valid =false;
                                    }
                                } else {
                                    valid = false;
                                }
                            } else {
                                valid = false;
                            }
                        }
                        b++;
                    }
                }
            } else {
                valid = false;
            }
            if (token[b]==7){
                b++;
                if (token[b]==1){
                    valid = true;
                } else if (token [b]==2){
                    b++;
                    if (token[b]==1){
                        valid = true;
                    } else {
                        valid = false;
                    }
                } else if (token[b]==9){
                    b++;
                    if (token[b]==1){
                        b++;
                        while (token[b]!= 10 && b<j-1){
                            if (token[b-1]==1){
                                if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                    b++;
                                    if (token[b]==1){
                                        valid = true;
                                    } else if (token[b]==2){
                                        b++;
                                        if (token[b]==1){
                                            valid ==true;
                                        } else {
                                            valid = false;
                                        }
                                    } else {
                                        valid = false;
                                    }
                                } else {
                                    valid = false;
                                }
                            } else if (token[b-1]==2){
                                b++;
                                if (token[b]==1){
                                    b++;
                                    if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                        b++;
                                        if (token[b]==1){
                                            valid = true;
                                        } else if (token[b]==2){
                                            b++;
                                            if (token[b]==1){
                                                valid = true;
                                            } else {
                                            valid = false;
                                            }
                                        } else {
                                            valid =false;
                                        }
                                    } else {
                                        valid = false;
                                    }
                                } else {
                                    valid = false;
                                }
                            }
                            b++;
                        }
                    } else if (token[b]==2){
                        b++;
                        if (token[b]==1){
                            b++;
                            while (token[b]!= 10 && b<j-1){
                                if (token[b-1]==1){
                                    if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                        b++;
                                        if (token[b]==1){
                                            valid = true;
                                        } else if (token[b]==2){
                                            b++;
                                            if (token[b]==1){
                                                valid ==true;
                                            } else {
                                                valid = false;
                                            }
                                        } else {
                                            valid = false;
                                        }
                                    } else {
                                        valid = false;
                                    }
                                } else if (token[b-1]==2){
                                    b++;
                                    if (token[b]==1){
                                        b++;
                                        if(token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                                            b++;
                                            if (token[b]==1){
                                                valid = true;
                                            } else if (token[b]==2){
                                                b++;
                                                if (token[b]==1){
                                                    valid = true;
                                                } else {
                                                valid = false;
                                                }
                                            } else {
                                                valid =false;
                                            }
                                        } else {
                                            valid = false;
                                        }
                                    } else {
                                        valid = false;
                                    }
                                }
                                b++;
                            }
                        }
                    }
                } else {
                    valid = false;
                }
            }
        } else {
            valid = false;
        }
    } else if(token[b]==9){         //awalan grouping
        b++;
        if (token[b]==1){
            b++;
            valid = true;
            while (b<j-1 && valid == true && token[b]!= 10){
                if (token[b-1]==1){
                    if (token[b]==3 || token[b]==4 || token[b]==5 || token[b]==8){
                        b++;
                        if (token[b]==1){
                            valid = true;
                        } else if (token[b]==2){
                            b++;
                            if (token[b]==1){
                                valid = true;
                            } else {
                                valid = false;
                            }
                        }
                    }
                }
                b++;
            }
            if (token[b]==10){
                valid = true;
            } else {
                valid = false;
            }
        }
    }



    if (valid){
        cout<<endl<<"Memenuhi";
    } else {
        cout<<endl<<"Tidak Memenuhi";
    }

    return 0;
}
