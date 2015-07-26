DESCRIPTION = "Motion - Software motion detection"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM="file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://github.com/sackmotion/motion.git"
SRC_URI[md5sum] = "ce7c6681d3c3d546efd843e56024a946"
SRC_URI[sha256sum] = "568b9731b36fd0afb27e0efc4baf7ddce709a47514b3ab324e9dd23cd4a36105"

SRCREV = "master"

DEPENDS = "libv4l"
# DEPENDS = "libv4l ffmpeg"

FILES_${PN} = "/usr/share/motion-trunkREVUNKNOWN/examples/* /usr/bin/motion /etc/motion-dist.conf"

#EXTRA_OECONF = "--prefix=/usr"

#By default data is unzipped to 20140113 but build happens in 20140113-1.0r0
do_configure_prepend() {
  cp -f -r ../git/* .
}

inherit autotools gettext