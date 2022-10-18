package PRAK_203_2110817310008_MuhammadKhaliqTeukuAnsari;

        //Pada baris ini terjadi error karena nama classnya berbeda, kita dapat mengganti nama classnya dengan nama Pegawai
        //public class Employee {
        public class Pegawai{
        public String nama;
        public String asal;
        //Pada baris diatas yang menyebabkan terjadinya pada file Main, ini terjadi karena tipe data variabel asal adalah char, kita dapat menggantinya dengan tipe data String
        //public char asal
        public String jabatan;
        //PAda baris ini, variabel umur tidak ada instasiasi dalam file main, kita dapat membuat instasiasi di dalam file main
        public int umur;

        public String getNama() {
            return nama;

        }

        public String getAsal() {
            return asal;

        }

        //Pada baris ini terjadi error karena didalam parameter jabatan tidak ada, kita dapat mengisi parameternya dan mengganti variabel j
        //public void setJabatan(){
        //  this.jabatan = j;
        public void setJabatan( String jabatan) {
            this.jabatan = jabatan;

        }


}
