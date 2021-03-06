DESCRIPTION = "Node offering the MPU-6050 accelerometer data connected to the I2C bus of the Intel Edison."
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=a624ee619e4d431ba76cc693ab90bca2"

DEPENDS = "roscpp"


SRC_URI = "file:///home/christoph/ros_catkin_ws/src/mpu6050-edison-ros_${PV}.tar.gz;downloadfilename=mpu6050-edison-ros_{PV}.tar.gz"
#SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
#SRC_URI[md5sum] = "d76ea0a49d8cf5ac21345119a617c60b"
#SRC_URI[sha256sum] = "7680d3e14c3dba8d393f7fde21eb2b5ac78d7024ac6fc5b13a653172bf8a2f30"

#SRC_URI += "file://0001-make-rostest-in-CMakeLists-optional-ros-rosdistro-30.patch;patchdir=../.."

#ROS_PKG_SUBDIR ?= ""
#S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"
S = "${WORKDIR}/${ROS_SPN}"

FILES_${PN} = "/opt/ros/hydro/lib/beginner_tutorials /opt/ros/hydro/lib/beginner_tutorials/talker ${bindir}" 

inherit catkin

ROS_SPN = "beginner_tutorials"
