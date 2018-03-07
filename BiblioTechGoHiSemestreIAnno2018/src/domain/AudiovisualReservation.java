
package domain;

import java.util.Date;

public class AudiovisualReservation {
    
    Audiovisual reservedAudiov;
    Student theStudent;
    Date deliveryDate;
    
    //Constructor
    public AudiovisualReservation(Audiovisual pAudio, Student pStudent, Date pDelivery){
        setReservedAudiov(pAudio);
        setTheStudent(pStudent);
        setDeliveryDate(pDelivery);
    }

    //Getters and Setters
    public Audiovisual getReservedAudiov() {
        return reservedAudiov;
    }

    private void setReservedAudiov(Audiovisual reservedAudiov) {
        this.reservedAudiov = reservedAudiov;
    }

    public Student getTheStudent() {
        return theStudent;
    }

    private void setTheStudent(Student theStudent) {
        this.theStudent = theStudent;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    private void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
}
