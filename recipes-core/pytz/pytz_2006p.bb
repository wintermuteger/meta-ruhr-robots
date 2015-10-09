DESCRIPTION = "Python Timezone Library"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5c41ec3eb91b0520c393ae015d5f8fa1"

DEPENDS = "roscpp std-msgs message-generation geometry-msgs i2c-tools"


SRC_URI = "file:///home/christoph/Downloads/pytz-${PV}.tar.gz;downloadfilename=pytz-{PV}.tar.gz"
SRC_URI[md5sum] = "9319364259c7b4eb77a218f7948f9fe8"
SRC_URI[sha256sum] = "b84569685426374242dfc7d4fa08c9694951e85203d085c256866cf87dcb0b7e"

#S = "${WORKDIR}/${ROS_SPN}"
S = "${WORKDIR}/pytz-${PV}"

#FILES_${PN} = "${bindir}" 

inherit setuptools

ROS_SPN = "pytz"
