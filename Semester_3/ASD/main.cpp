#include <iostream>
#include "multilist.h"

list_induk L_induk;
list_anak L_anak;
address p_induk;
address_anak p_anak;
infotypeanak x_an;
int main()
{
    createlist(L_induk);
    createlistanak(L_anak);

    menu_utama(L_induk,L_anak);

//    x_in.alamat = "Nganjuk";
//    x_in.goldarah = "O";
//    x_in.kontak = "082214119368";
//    x_in.nama = "Naofal";
//    x_in.noktp = "3518082008970003";
//    x_in.pekerjaan = "mahasiswa";
//    x_in.status = "Masih semester 3";
//    p_induk = alokasi(x_in);
//    insertfirst_induk(L_induk,p_induk);
//
//    x_in.alamat = "Bekasi";
//    x_in.goldarah = "AB";
//    x_in.kontak = "082214119368";
//    x_in.nama = "Fathur";
//    x_in.noktp = "3518082008970003";
//    x_in.pekerjaan = "mahasiswa";
//    x_in.status = "Masih semester 3";
//    p_induk = alokasi(x_in);
//    insertfirst_induk(L_induk,p_induk);
//
//
//    x_an.goldarah = "O";
//    x_an.kontak = "082214119368";
//    x_an.nama = "Hakim";
//    x_an.noktp = "1";
//    x_an.pekerjaan = "Anak 1";
//    x_an.status = "SMP";
//    p_anak = alokasianak(x_an);
//    insertfirst_anak(L_anak,p_anak);
//
//    printinfo(L_induk);
//    printinfo_anak(L_anak);
//    cout<<endl<<endl<<endl;
//    deletelast_induk(L_induk);
//    printinfo(L_induk);
    return 0;
}
