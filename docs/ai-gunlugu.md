# Yapay zekâ kullanım günlüğü

## 26 Kasım 2026 — Muhammet Mustafa Çalış

- Araç ve amaç — ChatGPT ile Java/XML proje iskeletini hazırlama.
- Doğrudan kullandığım çıktı — [Aynen kullandığın kod veya önerileri yaz.]
- Kendi yaptığım işlemler ve değişiklikler — [Gerçekte uyguladığın adımları yaz.]
- Doğrulama — [Kullandığın cihaz veya emülatör, derleme sonucu ve ekranda gördüğün yazı.]

## 28 Kasım 2026 — T07 Ekran Taslakları ve Prototip Geçişleri

- **Kullanılan AI / tasarım önerisi:** Dokuz ekranı ilk aşamada sade gri kutularla (kaba taslak) çizmek; `Silme Onayı` ve `Paylaşım Onayı` pencerelerini telefon ekranı dışına ayrı birer `Frame` olarak çıkarıp `Open overlay` / `Close overlay` ile bağlamak; oturumu kapalı kullanıcı için `Paylaş → Giriş / Profil → Paylaşım Onayı` yolunu çizip diğer oturum senaryolarını akış belgesinde not olarak belirtmek.
- **Kendi verdiğim yerleşim ve tasarım kararı:** Alt ekranlarda başlık kutusunu sağ üst köşeye konumlandırmak; alt menü düğmelerini ve harita konum işaretlerini pembe, onay kutusu düğmelerini mor renkle ayırarak tıklanabilir alanları belirginleştirmek; `Albümler` ekranında `Albüm sil` etiketini ve dört otomatik albüm kutusunun (`Renk`, `Duygu`, `Şehir`, `Ay`) yerleşimini çerçeveye sığacak şekilde düzenlemek.
- **Figma `Present` ile denenen geçişler:**
    - `Ana Galeri (+) → Kamera ve Anı Ekle (Kaydet) → Anı Detayı (Bugünkü hâlini gör) → AI Zaman Karşılaştırma → ←`
    - `Ana Galeri (Huzurlu)`, `Harita (Palandöken Anısı)` ve `Albümler (Örnek fotoğraf)` üzerinden `Anı Detayı`'na geçiş ve `←` (`Back`) ile geri dönüş
    - `Temizlik Önerileri → Seçilenleri sil` (`On tap` / `Open overlay`) → `Silme Onayı → İptal` (`Close overlay`)
    - `Anı Detayı → Paylaş → Giriş / Profil → Giriş Yap → Paylaşım Onayı → Akışta Paylaş → Sosyal Akış` ve 4 ana ekran arası alt menü geçişleri