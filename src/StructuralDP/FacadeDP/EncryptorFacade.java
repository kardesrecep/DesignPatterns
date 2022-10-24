package StructuralDP.FacadeDP;

public class EncryptorFacade {
    private AESEncryptor aesEncryptor = new AESEncryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();

    public void encrypt(String text, EncType encType ){
        switch (encType){
            case AES : aesEncryptor.encrypt(text); break;
            case MD5 : md5Encryptor.encrypt(text,"KEY"); break;
            case SHA : shaEncryptor.encrypt(text,"KEY",true);
        }

    }

    public enum EncType{
        SHA,
        MD5,
        AES
    }
}
