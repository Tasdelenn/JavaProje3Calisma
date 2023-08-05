import java.util.*;

public class BankSimulation {
    /**
     * NOT //////////////////////////////////////////////////////////////////////////////////////////////
     * Aşağıdaki üç field'ın (customers,accounts,scanner) final olması ilk bakışta
     * "bu listeler değiştirilemez olursa, bunlara nasıl müşteri veya hesap ekleriz?"
     * gibi bir soru akla getirebilir.
     * Ancak burada değiştirilemeyecek olan, değerlerin içi değil, referansıdır...
     * `BankSimulation` sınıfı içindeki `accounts` ve `customers` dizi-değişkenlerinin
     * `final` olmasının nedeni, bu değişkenlere atanan referansların sonradan değiştirilmesini engellemek
     * ve programın daha güvenli ve kontrol edilebilir olmasını sağlamaktır.
     * `final` anahtar kelimesiyle tanımlanan bir değişkenin değeri sadece bir kez atanabilir
     * ve sonradan değiştirilemez.
     * Bu tanımlama, `customers` değişkeninin referansının değiştirilemeyeceği anlamına gelir.
     * Ancak, `customers` değişkenine atanan `HashMap` nesnesinin içeriği yine de değiştirilebilir.
     * Yani, `customers` değişkeninin referansı aynı kalacak şekilde müşteri bilgileri eklenebilir,
     * güncellenebilir veya silinebilir.
     * ////////////////////////////////////////////////////////////////////////////////////////////////
     */
    // FIELDS ///////////////////////////////////////////////////////////////////////////////////////

    /** AÇIKLAMADA BELİRTİLEN FIELD LARI OLUŞTURUN...  */
    ////////////////////////////////////////////////////////////////////////////////////////////////

    // CONSTRUCTORS     ////////////////////////////////////////////////////////////////////////////
    // public BankSimulation() metodu bir constructor'dır.
    // Constructor, bir sınıfın nesnesi oluşturulduğunda otomatik olarak çağrılan bir metottur
    // ve nesnenin başlatılması için kullanılır.
    // BankSimulation sınıfındaki bu constructor,
    // sınıfın nesnesi oluşturulduğunda müşteri ve hesapları saklamak için
    // customers ve accounts değişkenlerini uygun şekilde başlatır.
    // Aynı zamanda kullanıcıdan girdiler almak için scanner değişkenini de başlatır.
    // Bu constructor sayesinde, BankSimulation sınıfından bir nesne oluşturduğunuzda,
    // müşteri ve hesap verilerini saklamak ve kullanıcıdan girdiler almak için gerekli olan
    // başlangıç durumu hazırlanmış olur.

    /** AÇIKLAMADA BELİRTİLEN CONSTRUCTORLARI OLUŞTURUN... */

    ///////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        /** BANKSIMULATION SINIFININ NESNESİNİ OLUŞTURUNUZ;*/
        /** RUN METODUNU ÇAĞIRINIZ */

    }

    // public void run() METODU, ÇIKIŞ YAPILANA KADAR ÇALIŞACAK OLAN ANA METOD ////////////////
    public void run() {
        int choice;

        /** ANA MENÜYÜ OLUŞTURUN VE MÜŞTERİYE YAPTIRDIĞINIZ SEÇİMLERLE, İLGİLİ METODLARA YÖNLENDİRİN...*/
        /**
         * "\n----- BANKA İŞLEMLERİ -----"
         * "1. Müşteri Listele"
         * "2. Yeni Müşteri Ekle"
         * "3. Müşteri İşlemleri"
         * "0. Çıkış"
         * "Seçiminizi yapın: "
         * */
                    //1//   listCustomers();
                    //2//   addCustomer();
                    //3//   customerOperationsMenu();
                    //0//   System.out.println("Çıkış yapılıyor...");
                    // //   System.out.println("Geçersiz seçim! Tekrar deneyin.");

        /** MÜŞTERİ ÇIKIŞ YAPMADIĞI SÜRECE MENÜDE KALMAYA DEVAM ETSİN...*/

    }
    ///////////////////////////////////////////////////////////////////////////////////////////


    // MÜŞTERİLERİ LİSTELEYECEK OLAN METHOD ///////////////////////////////////////////////////
    public void listCustomers() {
        System.out.println("\n----- MÜŞTERİLER -----");

        /** MÜŞTERİLERİ LİSTELEYECEK ŞEKİLDE METODU DOLDURUNUZ... */
    }
    ////////////////////////////////////////////////////////////////////////////////////////////


    // MÜŞTERİLER LİSTELENİRKEN HESAP BİLGİSİ DE LİSTELENMESİ İÇİN GEREKLİ METOD.////////////////
    public void listCustomerAccounts(Customer customer) {
        System.out.println("----- " + customer.getCustomerId() +
                " " + customer.getFirstName() +
                " " + customer.getLastName() +
                " HESAPLARI -----");

        /** MÜŞTERİ HESAPLARINI LİSTELEYECEK ŞEKİLDE METODU DOLDURUNUZ... */
    }
    //////////////////////////////////////////////////////////////////////////////////////////////


    // KONSOLDAN İSİM, SOYİSİM VE ŞEHİR BİLGİSİ ALARAK MÜŞTERİ EKLEME METODU. /////////////////////
    public void addCustomer() {
        System.out.println("\n----- YENİ MÜŞTERİ EKLE -----");

        /** KONSOLDAN İSİM, SOYİSİM VE ŞEHİR BİLGİSİ İSTEYİNİZ  */
        /** UNIQUE (TEKİL BİR MÜŞTERİ ID Sİ OLUŞTURUNUZ */
        /** ELDE ETTİĞİNİZ BU BİLGİLERLE YENİ MÜŞTERİ OLUŞTURUNUZ   */
        /** OLUŞTURDUĞUNUZ BİLGİLERİ BU SINIFIN FIELD ALANINDA TANIMLANAN MAP'E EKLEYİNİZ   */

        System.out.println("Müşteri başarıyla eklendi. Müşteri ID: " + "customerId");
    }
    /////////////////////////////////////////////////////////////////////////////////////////////


    // ANA MENÜDEN MÜŞTERİ İŞLEMLERİNİ SEÇİNCE KARŞIMIZA ÇIKACAK OLAN METOD /////////////////////
    // HANGİ MÜŞTERİ DEMEK, HANGİ MÜŞTERİ ID'Sİ DEMEK, BU KONTROLÜ YAPMAMIZ GEREK...
    // KONSOLDAN MÜŞTERİ ID Sİ YANLIŞ GİRİLİRSE, GEÇERSİZ MÜŞTERİ MESAJI VE TEKRAR ID İSTEMESİ GEREKECEK...
    public void customerOperationsMenu() {
        int customerId;
                    {
            System.out.println("\n----- MÜŞTERİ İŞLEMLERİ -----");
            System.out.println("0. Ana Menüye Dön");
            System.out.print("Müşteri ID girin (0 çıkış yapar): ");

            /** KULLANICIDAN (BANKA GİŞE MEMURU) İŞLEM YAPACAĞI MÜŞTERİ ID Sİ İSTEYİN... */
            /** BU ID'NİN MÜŞTERİ LİSTESİNDE OLUP OLMADIĞINI KONTROL EDİN...    */
            /** ID MAP TE YOKSA, "Geçersiz Müşteri ID. Tekrar deneyin." MESAJI VERİN... */
                     } /** BU BLOK KULLANICI ÇIKMAK İSTEMEDİĞİ SÜRECE DEVAM ETSİN... */
    }
    ///////////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////////////////
    // customerOperationsMenu() METODUNDA MÜŞTERİ ID'Sİ DOĞRULANIRSA, BANKA MEMURUNUN (KULLANICI)
    // KARŞISINA MÜŞTERİ İŞLEMLERİ GERÇEKLEŞTİREBİLECEĞİ AŞAĞIDAKİ GİBİ BİR MENÜ ÇIKACAK.
    // --- İSİM SOYİSİM 'İN --- İŞLEMLERİ ---
    // 1.Yeni Hesap Aç,
    // 2. Hesapları Listele
    // 3. Para Yatır
    // 4. Para Çek
    // 5. Bakiye Sorgula
    // 0. Ana Menüye Dön
    // Seçiminizi yapın:
    public void customerOperations(Customer customer) {
        int choice;
                            {
            System.out.println("\n----- " + customer.getFirstName() +
                    " " + customer.getLastName() +
                    " İŞLEMLERİ -----");

            /** MÜŞTERİ İŞLEMLERİ MENÜSÜNÜ EKRANA BASIN VE KULLANICIDAN TERCİH İSTEYİN... */
            /** SEÇİME GÖRE KULLANICIYI AŞAĞIDAKİNE BENZER METODLARLA SEÇTİĞİ OPERASYONA YÖNLENDİRİN... *
                    openNewAccount(customer);
                    listCustomerAccounts(customer);
                    depositToAccount(customer);
                    withdrawToAccount(customer);
                    checkBalance(customer);
                    System.out.println("Ana menüye dönülüyor...");
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
             */

                            } /** BU BLOK KULLANICI ÇIKMAK İSTEYENE KADAR DEVAM ETSİN... */
    }
    //////////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////////////////
    // HESAP AÇARKEN, AÇILACAK HESAP TÜRÜNÜ SEÇMEK İÇİN BİR MENÜ OLACAK...
    // HESAP TÜRÜNÜ SEÇTİKTEN SONRA DA, ID ATAYARAK accounts LIST İNE YENİ HESABI EKLEYEN METOD
    public void openNewAccount(Customer customer) {
        System.out.println("\n----- YENİ HESAP AÇ -----");
        System.out.println("Hesap Türü Seçin:");

        /** SEÇİM YAPMASI İÇİN KULLANICIYA HESAP TÜRLERİNİ (ENUM) LİSTELEYİN... */
        /** KULLANICIYA KONSOLDAN SEÇİM YAPTIRIN... */
        /** SEÇİLEN DEĞERE GÖRE HESAP TÜRÜNÜ ATAYIN >> accountType (CHECKING-VADESİZ HES,
         * SAVINGS-TASARRUF HES, CREDIT-KREDİ HES) GİBİ...*/

        /** TEKİL BİR HESAP ID'Sİ ATAYIN... HESAP LİSTESİNİN SİZE'INI KULLANARAK SAYAÇ ŞEKLİNDE ID ATANABİLİR...*/

        /** ELDE ETTİĞİNİZ DEĞERLERE GÖRE HESAP LİSTESİNE (accounts) YENİ HESABI EKLEYİNİZ... */

        /** NETİCE OLARAK HESAP EKLEME DURUMUNA GÖRE KULLANICIYA AŞAĞIDAKİ MESAJLARDAN BİRİNİ GÖSTERİN... */
            System.out.println("Hesap başarıyla açıldı. Hesap Numarası: " + "accountId");
            System.out.println("Geçersiz seçim! Yeni hesap açma işlemi iptal edildi.");

    }


    //yorum git
    // PARA EKLE ( deposit() ) METODU  ///////////////////////////////////////////////////////
    public void depositToAccount(Customer customer) {
        System.out.println("\n----- PARA YATIR -----");
        System.out.print("Hesap Numarasını Girin: ");
        /** KULLANICIDAN HESAP NUMARASINI ALARAK GEREKLİ KONTROLLERİ GERÇEKLEŞTİRİN
         * YATIRILMAK İSTENEN TUTAR NEGETİF Mİ? POZİTİF Mİ?
         * BU KONTROLÜ, Accounts SINIFINDAN OLUŞTURDUĞUNUZ NESNENİN İÇİNDE depositToAmount(amount) GİBİ
         * BİR METOD TANIMLAYARAK ORADA DA GERÇEKLEŞTİREBİLİRSİNİZ...
         */

        /** accountId VASITASIYLA İSTENEN HESABA ULAŞILABİLİR... */
        /** KULLANICININ GİRDİĞİ HESAP NUMARASI İLGİLİ MÜŞTERİYE AİT Mİ DİYE KONTROL EDİLMELİDİR...*/
        /** KONTROL SONUCUNDA HESAP SINIFI NESNESİNDEN ULAŞTIĞINIZ MÜŞTERİ ID Sİ İLE MÜŞTERİ SINIFININ
         * NESNESİNDEN ULAŞACAĞINIZ MÜŞTERİ ID Sİ AYNI İSE, YATIRILACAK TUTARI KONSOLDA KULLANICIDAN ALIN,
         * VE HESAP SINIFINDAKİ depositToAmount(amount) VASITASIYLA PARAYI YATIRIN...*/

        /** AKSİ HALDE: KULLANICIYA "Geçersiz Hesap Numarası veya hesap sizin değil! İşlem iptal edildi."
         * MESAJI VERİN...
         */
    }
    ////////////////////////////////////////////////////////////////////////////////////////////


    // PARA ÇEK ( withdraw() ) METODU  /////////////////////////////////////////////////////////
    public void withdrawToAccount(Customer customer) {
        System.out.println("\n----- PARA ÇEK -----");
        System.out.print("Hesap Numarasını Girin: ");

        /** KULLANICIDAN HESAP NUMARASINI İSTEYEREK PARA ÇEKME İŞLEMİNİ GERÇEKLEŞTİRİN... */
        /** İLGİLİ HESAPTAN PARA ÇEKERKEN, Accounts SINIFINDAKİ withdrawToAmount() METODUNU KULLANIN */
        /** BU METOD VASITASIYLA TUTARIN NEGATİF OLMA DURUMU KONTROL EDİLEBİLİR... */
        /** YİNE BU METOD VASITASIYLA ÇEKİLMEK İSTENEN TUTAR BAKİYEDEN BÜYÜK MÜ DİYE KONTROL EDİLEBİLİR...*/

        /** accountId VASITASIYLA İSTENEN HESABA ULAŞILABİLİR... */
        /** KULLANICININ GİRDİĞİ HESAP NUMARASI İLGİLİ MÜŞTERİYE AİT Mİ DİYE KONTROL EDİLMELİDİR...*/
        /** KONTROL SONUCUNDA HESAP SINIFI NESNESİNDEN ULAŞTIĞINIZ MÜŞTERİ ID Sİ İLE MÜŞTERİ SINIFININ
         * NESNESİNDEN ULAŞACAĞINIZ MÜŞTERİ ID Sİ AYNI İSE, ÇEKİLECEK TUTARI KONSOLDA KULLANICIDAN ALIN,
         * VE HESAP SINIFINDAKİ withDrawToAmount(amount) VASITASIYLA PARAYI ÇEKİN...*/

        /** AKSİ HALDE: KULLANICIYA "Geçersiz Hesap Numarası veya hesap sizin değil! İşlem iptal edildi."
         * MESAJI VERİN...
         */
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////




    int a = 5;
    //  BAKİYE SORGULAMA İPUCU METODU ///////////////////////////////////////////////////////////////////
    public void checkBalance(Customer customer) {
        System.out.println("\n----- BAKİYE SORGULA -----");
        System.out.print("Hesap Numarasını Girin: ");
        int accountId = scanner.nextInt();
        scanner.nextLine();

        Account account = getAccountById(accountId);
        if (account != null && account.getCustomerId() == customer.getCustomerId()) {
            System.out.println("Güncel bakiye: " + account.getBalance() + " TL");
        } else {
            System.out.println("Geçersiz Hesap Numarası veya hesap sizin değil! İşlem iptal edildi.");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////


    // İPUCU METODU ///////////////////////////////////////////////////////////////////////////////////
    // Bu metot, accounts listesinde belirli bir hesabı aramak için kullanılır.
    // Bu sayede, hesap işlemleri sırasında müşteriye ait doğru hesabın bulunması sağlanır.
    // Örneğin, para çekme ve yatırma işlemlerinde, belirli bir müşteriye ait olan hesap bilgilerine
    // doğru bir şekilde ulaşmak için bu metot kullanılır. Girilen accountId (hesap ID) 'sine
    // sahip bir hesap bulunmazsa, metot null değerini döndürür (return null)
    public Account getAccountById(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
}
