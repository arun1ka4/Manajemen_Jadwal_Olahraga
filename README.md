# Manajemen_Jadwal_Latihan_Olahraga

# Deskripsi Program
Program manajemen jadwal latihan olahraga adalah program berbasis Java yang digunakan user untuk mengatur jadwal latihan olahraga mingguan.
Fitur program ini terdiri dari:
1. Tambah jadwal -> Menambahkan jenis latihan serta hari latihan tersebut
2. Lihat jadwal -> Melihat jadwal latihan yang telah ditambahkan
3. Update jadwal -> Mengganti jenis latihan dan hari latihan sesuai nomor jadwal
4. Hapus jadwal -> Menghapus jadwal latihan yang ada sesuai nomor jadwal 
5. Keluar dari program -> Program berhenti

# Alur Program

## **Class Package**

<img width="321" height="67" alt="image" src="https://github.com/user-attachments/assets/94338cb7-35f8-476f-a632-9a2e7045c294" />

1. ArrayList -> Menyimpan kumpulan data yang bersifat dinamis
2. Scanner -> Menginput data dari user

<img width="572" height="102" alt="image" src="https://github.com/user-attachments/assets/92676258-9dfe-41a7-8f1a-5a731a413e5a" />

Program akan dieksekusi mulai dari method main(). Di dalamnya dibuat ArrayList dengan variabel jadwalLatihan untuk menyimpan jadwal latihan.

## **Pilih menu == 1**

<img width="587" height="272" alt="image" src="https://github.com/user-attachments/assets/56b59382-69cd-4feb-9e7a-bb686afbabb5" />

<img width="296" height="110" alt="image" src="https://github.com/user-attachments/assets/c50c3762-eb1c-4679-a3b7-b1acb6434251" />

Program masuk ke dalam perulangan do-while yang berarti menu dapat dijalankan berulang sampai syarat berhenti (while) terpenuhi, yaitu ketika user memilih opsi 5 (pilih == 5).
User dapat memilih opsi menu yang diinginkan dengan menginput nomor dari opsi menu tersebut.

<img width="537" height="242" alt="image" src="https://github.com/user-attachments/assets/9fe1c956-31d8-43ad-b28b-950a1beee24e" />

Output

<img width="566" height="237" alt="image" src="https://github.com/user-attachments/assets/1a179d40-52e5-46cd-aa71-29b7e0bb3bfb" />

Pada opsi 1, user dapat menambahkan jadwal latihan dengan menginput jenis latihan serta hari latihan itu dilakukan. Jadwal akan disimpan ke dalam ArrayList dengan format "Hari - Jenis Latihan".  Setelah user menambah jadwal, program akan menampilkan pesan "Jadwal berhasil ditambahkan" sebagai konfirmasi.

## **Pilih menu == 2**

<img width="715" height="205" alt="image" src="https://github.com/user-attachments/assets/a3e68023-f83b-414c-897f-5c4647b9d78c" />

Output

<img width="273" height="216" alt="image" src="https://github.com/user-attachments/assets/2295edfb-7bbd-4e12-a1a5-e604caf79bc0" />

Pada opsi 2, program akan memeriksa apakah ada data di dalam ArrayList. Pertama, program akan cek apakah jadwalLatihan kosong dengan size() == 0.Jika ada, jadwal akan ditampilkan dalam bentuk list.

<img width="302" height="168" alt="image" src="https://github.com/user-attachments/assets/8a8ca8b7-c99b-4b8d-b4d0-1178c3690da7" />

Jika kosong, program akan menampilkan pesan "Belum ada jadwal latihan."

## **Pilih menu == 3**

<img width="800" height="571" alt="image" src="https://github.com/user-attachments/assets/f6178b38-4878-4a8e-b597-82a6c11ce481" />

Output

<img width="363" height="168" alt="image" src="https://github.com/user-attachments/assets/339fc4e7-53b2-4150-8ec9-4f045e070231" />

Pada opsi 3, user dapat memilih salah satu jadwal yang ingin diperbarui dengan menginput sesuai dengan nomor jadwal. Jika nomor valid, user diminta memasukkan jenis latihan dan hari latihan. Setelah user memperbarui jadwal, program akan menampilkan pesan "Jadwal berhasil diperbarui" sebagai konfirmasi.

Output Update Jadwal Latihan

<img width="297" height="217" alt="image" src="https://github.com/user-attachments/assets/b803173e-ef6c-4c63-bd98-7443028c171a" />

Jika tidak ada jadwal latihan yang ditambahkan sebelumnya

<img width="300" height="171" alt="image" src="https://github.com/user-attachments/assets/e427f145-195c-4fa5-b372-1238ae71db15" />

Jika Nomor Tidak Sesuai yang di Jadwal

<img width="342" height="122" alt="image" src="https://github.com/user-attachments/assets/d4682283-1dea-418c-a308-ddc5a96e2714" />

## **Pilih menu == 4**

<img width="747" height="412" alt="image" src="https://github.com/user-attachments/assets/0bded36e-f27c-4dd8-8092-4ed7c354a71f" />

Output

<img width="372" height="256" alt="image" src="https://github.com/user-attachments/assets/22a06ad4-b78b-4076-8be9-24c6eede85e1" />

Pada opsi 4, user dapat menghapus salah satu jadwal sesuai dengan nomor jadwal yang ditampilkan. Setelah user mwnghapus jadwal, program akan menampilkan pesan "Jadwal berhasil dihapus" sebagai konfirmasi.  

<img width="282" height="197" alt="image" src="https://github.com/user-attachments/assets/3d5e7fe7-1e30-4899-9771-bb66d9eb397f" />

Jika tidak ada jadwal yang ditambahkan

<img width="300" height="171" alt="image" src="https://github.com/user-attachments/assets/25db9124-9644-4574-a283-b3db7cd67040" />9

Jika nomor tidak sesuai yang di jadwal

<img width="360" height="127" alt="image" src="https://github.com/user-attachments/assets/8a36110b-4e4e-409b-838c-b46d17642bb4" />

## **Pilih menu == 5**

<img width="572" height="53" alt="image" src="https://github.com/user-attachments/assets/f5140ecd-fff6-4fee-b56f-4f8257df0185" />

Output

<img width="663" height="216" alt="image" src="https://github.com/user-attachments/assets/bb5f5788-31e3-4599-b6ac-e0200d766e19" />

Jika memilih opsi ini, pengulangan berhenti dan program selesai

## **Jika mengetik nomor yang tidak ada di opsi menu**

<img width="522" height="75" alt="image" src="https://github.com/user-attachments/assets/7e5194b9-c523-4fc0-832a-218b2b590175" />

Output

<img width="297" height="172" alt="image" src="https://github.com/user-attachments/assets/31c4a944-4003-440d-a750-a4d48148a733" />

Jika user mengetik angka di luar opsi menu (1-5), program akan menampilkan pesan "Pilihan tidak valid". Setelah itu, program kembali menampilkan menu utama.




