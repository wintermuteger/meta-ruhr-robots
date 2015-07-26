DESCRIPTION = "libGD"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM="file://COPYING;md5=c97638cafd3581eb87abd37332137669"

SRC_URI = "http://github.com/libgd/libgd/archive/gd-${PV}.tar.gz"
SRC_URI[md5sum] = "e91a1a99903e460e7ba00a794e72cc1e"
SRC_URI[sha256sum] = "a68c69d2fe3eaab9db63b1c4d391dd549c26d3b47bfba484d5ed2d433c55d4d8"

DEPENDS="libpng jpeg"

EXTRA_OECMAKE = "-DENABLE_JPEG=1 -DENABLE_PNG=1"

FILES_${PN} = "/usr/share/docs/* ${bindir}/*"

inherit cmake