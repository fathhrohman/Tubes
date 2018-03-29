#include "multilist.h"
void createlistanak(list_anak &la){
    la.first =NULL;
    la.last = NULL;
}

address_anak alokasianak(infotypeanak x){
    address_anak q = new elmlistanak;
    q->info = x;
    q->next = NULL;
    return q;
}

address_anak dealokasi_anak(address_anak p){
    delete p;
}

void insertfirst_anak(list_anak &la,address_anak p){
    if(la.first== NULL){
        la.first = p;
    } else {
        p->next = la.first;
        la.first = p;
    }
}
void insertlast_anak(list_anak &la, address_anak p){
    if (la.first==NULL){
        la.first = p;
    } else {
        la.last->next = p;
        la.last = p;
    }
}
void inserafter_anak(list_anak &la,address_anak prec, address_anak p){
    p->next = prec->next;
    prec->next = p;
}

void printinfo_anak(list_anak la){
    if (la.first == NULL){
        cout<<"list anak kosong"<<endl;
    } else {
        address_anak q = la.first;
        cout<<"List Anggota Keluarga : "<<endl;
        while (q != NULL){
            cout<<"No KTP : "<<q->info.noktp<<endl;
            cout<<"Nama : "<<q->info.nama<<endl;
            cout<<"Kontak : "<<q->info.kontak<<endl;
            cout<<"Pekerjaan : "<<q->info.pekerjaan<<endl;
            cout<<"Status : "<<q->info.status<<endl;
            cout<<"Gol.Darah : "<<q->info.goldarah<<endl;
            q = q->next;
        }
    }
}

void deletefirst_anak(list_anak &l/*,address_anak &p*/){
    address_anak p;
    if(l.first == NULL){
        cout<<"Data Keluarga sudah kosong";
    }else{
        p = l.first;
        l.first = p->next;
        dealokasi_anak(p);
    }
};

void deletelast_anak(list_anak &l /*,address_anak &p*/){
    address_anak p;
    if(l.first == NULL){
        cout<<"Data Keluarga sudah kosong";
    }else{
        p = l.first;
        while(p->next != l.last){
            p = p->next;
        }
        l.last = p;
        p = p->next;
        dealokasi_anak(p);
    }
};

void deleteafter_anak(list_anak &l,address_anak prec,address_anak &p){
//    if(l.first == NULL){
//        cout<<"Data keluarga sudah kosong ";
//    }else{
//        do{
//            p = p->next;
//        }while(p != prec && l.first != );
//    }
};
