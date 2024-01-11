package com.vanannek.behavioral.observer.digitalocean;

public interface Observer {
    void update();
    void setSubject(Subject sub);
}
