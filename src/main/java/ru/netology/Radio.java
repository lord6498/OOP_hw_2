package ru.netology;

public class Radio {

    private int channel;
    private int volume;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {

        if (channel > 9) {
            this.channel = 0;
        } else {
            this.channel = channel;
        }
        if (channel < 0) {
            this.channel = 9;
        }

    } //Управление переключением каналов

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) { //Управление переключением громкости
        if (volume > 10 | volume < 0) {
            return;
        } else this.volume = volume;
    }

    public void next(int channel) {
        int channelValue = (channel + 1);
        if (channelValue>9){
            setChannel(0);
        }
        else {
            setChannel(channelValue);
        }
    }

    public void prev(int channel) {
        int channelValue = (channel - 1);
        if (channelValue<0){
            setChannel(9);
        }
        else {
            setChannel(channelValue);
        }
    }

    public void volumeUp(int volume) { //Прибавка громкости
        setVolume(volume + 1);
    }

    public void volumeDown(int volume) { //Отбавка громкости
        setVolume(volume - 1);
    }

}


