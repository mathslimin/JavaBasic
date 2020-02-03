package AccessModifier;
 class AudioPlayer {
     protected void openSpeaker( ) {
         //实现细节

     }
}

class StreamingAudioPlayer extends AudioPlayer {
    @Override
    protected void openSpeaker( ) {
        // 实现细节
    }
}