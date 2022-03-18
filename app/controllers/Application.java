package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index(String name) {
        render(name);
    }

    public static void hello(String name1, String name2) {
        render(name1, name2);
    }

}