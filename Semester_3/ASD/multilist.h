#ifndef MULTILIST_H_INCLUDED
#define MULTILIST_H_INCLUDED
#include <iostream>
#include <stdlib.h>

using namespace std;

struct kepalakeluarga{
    string noktp;
    string nama;
    string alamat;
    string kontak;
    string pekerjaan;
    string status;
    string goldarah;
};
struct keluarga{
    string noktp;
    string nama;
    string kontak;
    string pekerjaan;
    string status;
    string goldarah;
};
typedef kepalakeluarga infotypeinduk;
typedef keluarga infotypeanak;
typedef struct elmlistinduk *address;
typedef struct elmlistanak *address_anak;


struct list_anak{
    address_anak first;
    address_anak last;
};

struct elmlistinduk{
    infotypeinduk info;
    list_anak lanak;
    address next;
    address prev;
};
struct elmlistanak{
    infotypeanak info;
    address_anak next;
};
struct list_induk{
    address first;
    address last;
};

void createlist(list_induk &l);
void createlistanak(list_anak &la);
address alokasi(infotypeinduk x);
address_anak alokasianak(infotypeanak x);
address dealokasi(address p);
address_anak dealokasi_anak(address_anak p);
void insertfirst_induk(list_induk &l,address p);
void insertlast_induk(list_induk &l,address p);
void inserafter_induk(list_induk &l,address prec,address p);
void insertfirst_anak(list_anak &la,address_anak p);
void insertlast_anak(list_anak &la,address_anak p);
void inserafter_anak(list_anak &la,address_anak prec, address_anak p);
void inseredit_induk(list_induk &l,address prec,address p);
void deletefirst_induk(list_induk &l/*,address &p*/);
void deletelast_induk(list_induk &l/*,address &p*/);
void deleteafter_induk(list_induk &l,address prec,address &p);
void deletefirst_anak(list_anak &l/*,address_anak &p*/);
void deletelast_anak(list_anak &l/*,address_anak &p*/);
void deleteafter_anak(list_anak &l,address_anak prec,address_anak &p);
void printinfo(list_induk l);
void printinfo_anak(list_anak la);
address findelm_induk(list_induk l,infotypeinduk x);
address_anak findelm_anak(list_anak la,infotypeanak x);
void printinfo_edit(list_induk l);

//generate function
void input_data(list_induk &L_induk, list_anak &L_anak);
void edit_data(list_induk &L_induk, list_anak &L_anak);
void delete_data(list_induk &L_induk, list_anak &L_anak);
void view_data(list_induk L_induk, list_anak L_anak);
void menu_utama(list_induk &L_induk, list_anak &L_anak);

#endif // MULTILIST_H_INCLUDED
