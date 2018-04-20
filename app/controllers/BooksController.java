package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Mingze Jin on 4/16/2018
 */

import view.html.books.*;

public class BooksController extends Controller{

    // for all books
    public Result index() {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    // to create book
    public Result create() {
        return TODO;
    }

    // to save book
    public Result Save() {
        return TODO;
    }

    public Result edit(Integer id) {
        return TODO;
    }

    public Result update() {
        return TODO;
    }

    public Result destroy(Integer id) {
        return TODO;
    }

    // for book details
    public Result show(Integer id) {
        return TODO;
    }
}
