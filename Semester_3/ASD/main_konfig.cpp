#include "multilist.h"

void input_data(list_induk &L_induk, list_anak &L_anak){

    int pil, pil_input;
    infotypeinduk x_in;
    address p;

    system("cls");
    cout<<"===== Menu Input : ====="<<endl;
    cout<<"1. Masukkan data Kepala Keluarga "<<endl;
    cout<<"2. Masukkan data Keluarga "<<endl;
    cout<<"3. Menu Utama"<<endl;
    cout<<"masukkan pilihan anda = ";cin>>pil;
    switch(pil){
    case 1 :
        cout<<endl;
        cout<<"==== Menu input kepala keluarga ===="<<endl;
        cout<<"Masukkan data kepala keluarga !"<<endl;

        cout<<"Nomer KTP : ";cin>>x_in.noktp;cout<<endl;
        cout<<"Nama : ";cin>>x_in.nama;cout<<endl;
        cout<<"Alamat : ";cin>>x_in.alamat;cout<<endl;
        cout<<"Golongan Darah : ";cin>>x_in.goldarah;cout<<endl;
        cout<<"Kontak : ";cin>>x_in.kontak;cout<<endl;
        cout<<"Profesi : ";cin>>x_in.pekerjaan;cout<<endl;
        cout<<"Status : ";cin>>x_in.status;cout<<endl;

        p = alokasi(x_in);

        cout<<"==== Pilih metode insert ===="<<endl;
        cout<<"Metode insert first"<<endl;
        cout<<"Metode insert last"<<endl;
        cout<<"Metode insert after"<<endl;
        cout<<"Pilih metode insert : ";cin>>pil_input;


            switch(pil_input){
            case 1 :
                insertfirst_induk(L_induk,p);
                input_data(L_induk,L_anak);
            break;
            case 2 :
                insertlast_induk(L_induk,p);
                input_data(L_induk,L_anak);
                break;
            case 3 :
                infotypeinduk x;
                address prec;
                cout<<"Masukkan nomor KTP : ";cin>>x.noktp;cout<<endl;
                prec = findelm_induk(L_induk,x);
                inserafter_induk(L_induk,prec,p);
                input_data(L_induk,L_anak);
                break;
            }
        break;

    case 2 :
        cout<<endl;
        cout<<"==== Menu input keluarga ===="<<endl;
        cout<<"Masukkan data dengan metode(insert first)"<<endl;
        cout<<"Masukkan data dengan metode(insert last)"<<endl;
        cout<<"Masukkan data dengan metode(insert after)"<<endl;
        break;

    case 3 :
        system("cls");
        menu_utama(L_induk,L_anak);
        break;
    }

};

void edit_data(list_induk &L_induk, list_anak &L_anak){
    system("cls");
    cout<<"==== Menu Edit : ===="<<endl;
    cout<<" Edit data Kepala Keluarga "<<endl;
    infotypeinduk x_in;
    address prec;
    printinfo_edit(L_induk);
    cout<<"Masukkan No KTP orang yang ingin di edit : ";cin>>x_in.noktp;cout<<endl;
    prec = findelm_induk(L_induk,x_in);
    cout<<"Masukkan data baru"<<endl;
    cout<<"Nama : ";cin>>prec->info.nama;cout<<endl;
    cout<<"Alamat : ";cin>>prec->info.alamat;cout<<endl;
    cout<<"Golongan Darah : ";cin>>prec->info.goldarah;cout<<endl;
    cout<<"Kontak : ";cin>>prec->info.kontak;cout<<endl;
    cout<<"Profesi : ";cin>>prec->info.pekerjaan;cout<<endl;
    cout<<"Status : ";cin>>prec->info.status;cout<<endl;
    menu_utama(L_induk,L_anak);
};

void delete_data(list_induk &L_induk, list_anak &L_anak){
    system("cls");
/*    int pil,pil_input;
    cout<<"==== Menu Delete : ===="<<endl;
    cout<<"1. Delete data Kepala Keluarga "<<endl;
    cout<<"2. Delete data Keluarga "<<endl;
    cout<<"3. Menu Utama "<<endl;
    cout<<"masukkan pilihan anda = ";cin>>pil;
    switch(pil){
    case 1 :
        cout<<"==== Pilih metode insert ===="<<endl;
        cout<<"1. Metode delete first"<<endl;
        cout<<"2. Metode delete last"<<endl;
        cout<<"3. Metode delete after"<<endl;
        cout<<"Pilih metode insert : ";cin>>pil_input;
        switch(pil_input){
        case 1 :
            deletefirst_induk(L_induk);
            delete_data(L_induk,L_anak);
            break;
        case 2 :
            deletelast_induk(L_induk);
            delete_data(L_induk,L_anak);
            break;
        case 3 :
            infotypeinduk x;
            address prec,p;
            printinfo(L_induk);
            cout<<"Masukkan nomor KTP : ";cin>>x.noktp;cout<<endl;
            prec = findelm_induk(L_induk,x);
            p = prec->next;
            deleteafter_induk(L_induk,prec,p);
            delete_data(L_induk,L_anak);
            break;
        }*/
    case 2 :

    case 3 :
        system("cls");
        menu_utama(L_induk,L_anak);
        break;
    }
};

void view_data(list_induk L_induk, list_anak L_anak){
    system("cls");
    cout<<"=== Data output ===="<<endl;
    printinfo(L_induk);
    printinfo_anak(L_anak);
};

void menu_utama(list_induk &L_induk, list_anak &L_anak){
    int pil;
    cout<<"Daftar menu rekapan data keluarga: "<<endl;
    cout<<"1. Insert Data "<<endl;
    cout<<"2. Edit Data "<<endl;
    cout<<"3. Delete Data "<<endl;
    cout<<"4. View Data "<<endl;
    cout<<"5. Exit"<<endl;
    cout<<"Masukkan pilihan anda = ";cin>>pil;

    switch (pil) {
    case 1 :
        input_data(L_induk, L_anak);
        break;
    case 2 :
        edit_data(L_induk, L_anak);
        break;
    case 3 :
        delete_data(L_induk, L_anak);
        break;
    case 4 :
        view_data(L_induk,L_anak);
        menu_utama(L_induk,L_anak);
        break;
    case 5 :

        break;
    }
}
