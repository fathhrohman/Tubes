#include "multilist.h"

void createlist(list_induk &l){
    l.first =NULL;
    l.last = NULL;
}
address alokasi(infotypeinduk x){
    address p = new elmlistinduk;
    p->info= x;
    p->next = NULL;
    p->prev = NULL;
    p->lanak.first = NULL;
    p->lanak.last = NULL;
    createlistanak(p->lanak);
    return p;
}

address dealokasi(address p){
    delete p;
}

void insertfirst_induk(list_induk &l,address p){
    if(l.first == NULL){
        l.first = p;
        l.last = p;
    } else {
        p->next = l.first;
        l.first->prev = p;
        l.first = p;
    }
}
void insertlast_induk(list_induk &l,address p){
    if (l.first == NULL){
        l.first = p;
        l.last = p;
    } else {
        p->prev = l.last;
        p->next = NULL;
        l.last->next = p;
        l.last = p;
    }
}
void inserafter_induk(list_induk &l,address prec,address p){
    p->next = prec->next;
    prec->next = p;
    p->prev = p;
}
void deletefirst_induk(list_induk &l){
    address p;
    if(l.first == NULL){
        cout<<"Data kepala keluarga sudah kosong";
    }else{
        p = l.first;
        l.first = p->next;
        dealokasi(p);
    }
};

void deletelast_induk(list_induk &l){
    address p;
    if(l.first == NULL && l.last == NULL){
        cout<<" Data kepala keluarga kosong ";
    }else{
        p = l.last;
        l.last = p->prev;
        l.last->next = NULL;
        dealokasi(p);
    }
};

void deleteafter_induk(list_induk &l,address prec, address &p){
        if(l.first == l.last || prec->next == NULL)
    {
        if(l.first == NULL)
            cout<<"Tidak ada data setelah ruangan "<<endl;
    }
    else if (prec != l.last)
    {
        p = prec->next;
        p->next->prev = prec;
        prec->next = p->next;
        p->next = NULL;
        p->prev = NULL;
        delete p;
    }
};

void printinfo(list_induk l){
    if(l.first == NULL){
        cout<<"list kosong"<<endl;
    } else {
        address p = l.first;
        cout<<"List kepala keluarga : "<<endl;
        while (p != NULL){
            cout<<"No KTP : "<<p->info.noktp<<endl;
            cout<<"Nama : "<<p->info.nama<<endl;
            cout<<"Alamat : "<<p->info.alamat<<endl;
            cout<<"Kontak : "<<p->info.kontak<<endl;
            cout<<"Pekerjaan : "<<p->info.pekerjaan<<endl;
            cout<<"Status : "<<p->info.status<<endl;
            cout<<"Gol.Darah : "<<p->info.goldarah<<endl;
            cout<<endl;
            p = p->next;
        }
    }
}
void printinfo_edit(list_induk l){
    if(l.first == NULL){
        cout<<"list kosong"<<endl;
    } else {
        address p = l.first;
        cout<<"List kepala keluarga : "<<endl;
        while (p != NULL){
            cout<<"No KTP : "<<p->info.noktp<<endl;
            cout<<"Nama : "<<p->info.nama<<endl;
            cout<<endl;
            p = p->next;
        }
    }
}

address findelm_induk(list_induk l,infotypeinduk x){
    address p = l.first;
    while (p != NULL){
        if (p->info.noktp == x.noktp){
            return p;
        }
        p = p->next;
    }
}
address_anak findelm_anak(list_anak la,infotypeanak x){
    address_anak q = la.first;
    while (q != NULL){
        if (q->info.noktp == x.noktp){
            return q;
        }
        q = q->next;
    }
}
