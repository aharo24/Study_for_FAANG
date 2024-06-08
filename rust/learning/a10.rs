// Topic: Working with expressions
//
// Requirements:
// * Print "its big" if a variable is > 100
// * Print "its small" if a variable is <= 100
//
// Notes:
// * Use a boolean variable set to the result of
//   an if..else expression to store whether the value
//   is > 100 or <= 100
// * Use a function to print the messages
fn print_msg(msg: bool) {
    match msg {
        false => println!("is small"),
        true => println!("is BIG"),
    };
}
// * Use a match expression to determine which message
//   to print

fn main() {
    let numba = 169;
    let is_big = numba >= 100;
    print_msg(is_big);
}
