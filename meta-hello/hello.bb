DESCRIPTION = "Prints Hello World"
PN = "hello"
PV = "1"

python do_build() {
    bb.plain("********************");
    bb.plain("*                  *");
    bb.plain("* Hello, World!    *");
    bb.plain("*                  *");
    bb.plain("********************");
}

