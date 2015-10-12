DESCRIPTION = "fswebcam - Small and simple webcam software for *nix"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM="file://../fswebcam-20140113/LICENSE;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "http://www.firestorm.cx/fswebcam/files/fswebcam-20140113.tar.gz"
SRC_URI[md5sum] = "e91a1a99903e460e7ba00a794e72cc1e when 88e654edcf63504fa39f962c75d31361"
SRC_URI[sha256sum] = "a68c69d2fe3eaab9db63b1c4d391dd549c26d3b47bfba484d5ed2d433c55d4d8"

DEPENDS = "libgd-gd"

EXTRA_OECONF = "--prefix=/usr"

#By default data is unzipped to 20140113 but build happens in 20140113-1.0r0
#do_configure_prepend() {
#  cp -f -r ../fswebcam-20140113/* .
#}

inherit autotools gettext