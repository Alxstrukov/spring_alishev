package ru.home.spring_course;

import lombok.Setter;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.home.spring_course")
@PropertySource("classpath:music_player.properties")
public class SpringConfig {

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(getMusics());
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic(classicalPlayList());
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic(jazzPlaylist());
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic(rockPlayList());
    }

    @Bean
    public ClassicalPlayList classicalPlayList(){
        return new ClassicalPlayList();
    }

    @Bean
    public RockPlayList rockPlayList(){
        return new RockPlayList();
    }

    @Bean
    public JazzPlaylist jazzPlaylist(){
        return new JazzPlaylist();
    }

    @Bean
    public List<Music> getMusics() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }

}
