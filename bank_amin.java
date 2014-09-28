program bank_amin;
uses crt;
var
saldo, penarikan, jumlah:real;
begin
saldo:= 300000;
jumlah:= saldo;
writeln('Jumlah saldo anda= Rp.300000');
writeln('Jumlah saldo yang akan ditarik = ');
readln(Penarikan);
if penarikan <100000 then writeln('Penarikan saldo anda terlalu kecil Penarikan minimal Rp.',jumlah:2:2); end; begin jumlah:=jumlah - penarikan; writeln('Karena sisa saldo anda Rp',jumlah:2:2,' jika menarik dengan jumlah di atas'); end; begin if jumlah - penarikan >100000 then
writeln ('Terima kasih atas transaksi yang anda lakukan...');
if jumlah - penarikan <40000 then writeln('Terima kasih atas transaksi yang anda lakukan... :'); end; end. 