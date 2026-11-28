# Kameri · T07 ekran taslakları

**Hazırlayan** — Muhammet Mustafa Çalış  
**Çalışma tarihleri** — 27–28 Kasım 2026  
**Figma prototipi** — [Ana Galeri’den başlat](https://www.figma.com/design/iAjGd9uQWOU3oh9XHKih6o/Kameri---Ekran-Taslaklar%C4%B1?node-id=18-473&t=8FKx4kQyQJBKh5e7-1)

## Ekranlar ve geçişler

| Ekran | Çizimdeki içerik | Düğme ve hedef ekran |
|---|---|---|
| Ana Galeri | Arama, renk filtreleri, iki sütunlu fotoğraf kartları ve duygu etiketi | `+` → Kamera ve Anı Ekle. `Huzurlu` fotoğraf kartı → Anı Detayı. `Temizlik` → Temizlik Önerileri. |
| Kamera ve Anı Ekle | Fotoğraf çekme veya galeriden seçme, renk, konum, hava, duygu ve not | `Kaydet` → Anı Detayı. Geri oku → önceki ekran. |
| Anı Detayı ve Düzenleme | Fotoğraf, tarih, konum, duygu, not, o günün ve bugünün havası, düzenleme, silme ve paylaşma düğmeleri | `Bugünkü hâlini gör` → AI Zaman Karşılaştırma. Oturum kapalıyken `Paylaş` → Giriş / Profil. |
| AI Zaman Karşılaştırma | Orijinal fotoğraf, bugünkü hâli, karşılaştırma kaydırıcısı ve yerel efekt açıklaması | Geri oku → karşılaştırmayı açtığım anının detayı. |
| Harita | Anıların konum işaretleri ve seçili anının adı | `Palandöken Anısı` → Anı Detayı. |
| Albümler | Manuel albümler, anı ekleme/çıkarma, albüm silme ve renk, duygu, şehir, ay grupları | `Kış 2026` albümündeki örnek fotoğraf → Anı Detayı. |
| Temizlik Önerileri | Ekran görüntüleri, bulanık fotoğraflar, seçim kutuları ve `Tut` düğmesi | `Seçilenleri sil` → Silme Onayı. `İptal` → pencere kapanır ve aynı listeye dönülür. |
| Sosyal Akış | Kullanıcı adı, paylaşılan fotoğraf, beğeni ve yorum | `Profil` → Giriş / Profil. |
| Giriş / Profil | Oturum kapalıyken e-posta, şifre, giriş ve kayıt. Oturum açıkken ad ve profil fotoğrafı. | Paylaşım sırasında `Giriş Yap` veya `Kaydol` → Paylaşım Onayı. `Akışta Paylaş` → Sosyal Akış. |

## Paylaşım akışı

Oturumu kapalı kullanıcı bir anıyı paylaşmak istediğinde önce giriş yapar veya kaydolur. Ardından aynı anının paylaşım onayına döner. Notunu ve konumunu paylaşmak isteyip istemediğini seçer.

Oturumu zaten açık olan kullanıcı için planlanan yol `Anı Detayı → Paylaş → Paylaşım Onayı → Akışta Paylaş` şeklindedir.

## Figma önizlemesinde denediğim geçişler

- [x] Galeride `+` ile Anı Ekle’yi açtım. `Kaydet` ile Anı Detayı’na geçtim.
- [x] `Bugünkü hâlini gör` ile karşılaştırmayı açtım ve geri okuyla aynı anıya döndüm.
- [x] Galerideki `Huzurlu` kartından, haritadaki `Palandöken Anısı` işaretinden ve albümdeki örnek fotoğraftan Anı Detayı’na ulaştım.
- [x] `Seçilenleri sil` ile onay penceresini açtım. `İptal` ile temizlik listesine döndüm.
- [x] `Paylaş → Giriş Yap → Paylaşım Onayı → Akışta Paylaş` yolunu izleyip Sosyal Akış’a ulaştım.
- [x] Alt menüden Galeri, Albümler, Harita ve Akış arasındaki geçişleri denedim.

## Ekip incelemesi

28 Kasım’da PR #4 üzerinden Alihan ve Kenan’dan taslakları incelemelerini istedim.