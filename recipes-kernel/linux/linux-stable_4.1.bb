require recipes-kernel/linux/linux-yocto.inc

KERNEL_IMAGETYPE = "zImage"

COMPATIBLE_MACHINE = "beaglebone"

RDEPENDS_kernel-base += "kernel-devicetree"

KERNEL_DEVICETREE_beaglebone = " \
    am335x-boneblack.dtb \
    bbb-hdmi.dtb \
    bbb-nohdmi.dtb \
    bbb-4dcape70t.dtb \
    bbb-nh5cape.dtb \
 "

LINUX_VERSION = "4.1"
LINUX_VERSION_EXTENSION = "-jumpnow"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-stable-4.1:"

S = "${WORKDIR}/git"

PR = "r18"

# v4.1.13  
SRCREV = "1f2ce4a2e7aea3a2123b17aff62a80553df31e21"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.1.y \
    file://defconfig \
    file://0001-spidev-Add-generic-compatible-dt-id.patch \
    file://0002-Add-bbb-spi1-spidev-dtsi.patch \
    file://0003-Add-bbb-i2c1-dtsi.patch \
    file://0004-Add-bbb-i2c2-dtsi.patch \
    file://0005-Add-bbb-hdmi-dts.patch \
    file://0006-Add-bbb-4dcape70t-dts.patch \
    file://0007-Add-ft5x06-touchscreen-driver.patch \
    file://0008-Add-bbb-nh5cape-dts.patch \
    file://0009-Add-4dcape70t-button-dtsi.patch \
    file://0010-4dcape70t-dts-include-button-dtsi-comment-out-spi.patch \
    file://0012-4dcape70t-Increase-charge-delay.patch \
    file://0013-Add-uart4-dtsi.patch \
    file://0014-Include-uart4-dtsi-in-bbb-dts-files.patch \
    file://0015-bbb-nh5cape-Fix-bpp-for-24-bit-color.patch \
    file://0016-Add-bbb-can0-and-can1-dtsi.patch \
    file://0017-Add-bbb-uart1-uart2-and-uart5-dtsi.patch \
    file://0018-Add-bbb-nohdmi-dts.patch \
 "

