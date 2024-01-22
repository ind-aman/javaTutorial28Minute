package com.started.demo.Configuration;

import com.started.demo.core.IGameConsole;
import com.started.demo.core.IGameRunner;
import com.started.demo.implementation.GameRunner;
import com.started.demo.implementation.MarioGame;
import com.started.demo.implementation.PackmanGame;
import com.started.demo.implementation.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfiguration {

    @Bean(name="MarioGame")
    public IGameConsole MarioGame(){
        return new MarioGame();
    }
    @Bean
    public  IGameConsole PackmanGame(){
        return new PackmanGame();
    }

    @Bean
    public IGameConsole SuperContra(){
        return  new SuperContraGame();
    }

    @Bean(name = "RunMario")
    @Primary
    public IGameRunner gameRunner(IGameConsole MarioGame) {
        return new GameRunner(MarioGame);
    }

    @Bean(name="RunPackman")
    public IGameRunner gameRunner1(){
        return  new GameRunner(PackmanGame());
    }

    @Bean(name = "RunSuperContra")
    public IGameRunner gameRunner2(){
        return new GameRunner(SuperContra());
    }
}
