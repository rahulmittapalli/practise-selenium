var app = angular.module('reportingApp', []);

app.controller('ScreenshotReportController', function ($scope) {
    $scope.searchSettings = {
        description: '',
        passed: true,
        failed: true,
        pending: true,
        withLog: true,
    };

    $scope.inlineScreenshots = false;
    this.showSmartStackTraceHighlight = true;

    this.chooseAllTypes = function () {
        $scope.searchSettings.passed = true;
        $scope.searchSettings.failed = true;
        $scope.searchSettings.pending = true;
        $scope.searchSettings.withLog = true;
    };

    this.getParent = function (str) {
        var arr = str.split('|');
        str = "";
        for (var i = arr.length - 2; i > 0; i--) {
            str += arr[i] + " > ";
        }
        return str.slice(0, -3);
    };

    this.specLevel = function (str) {
        var arr = str.split('|');
        str = "";
        if (arr.length < 3) {
            return true;
        }
        return false;
    };

    this.getSpec = function (str) {
        return getSpec(str);
    };


    this.getShortDescription = function (str) {
        return str.split('|')[0];
    };


    this.nToBr = function (str) {
        return str.replace(/(?:\r\n|\r|\n)/g, '<br />');
    };


    this.convertTimestamp = function (timestamp) {
        var d = new Date(timestamp),
            yyyy = d.getFullYear(),
            mm = ('0' + (d.getMonth() + 1)).slice(-2),
            dd = ('0' + d.getDate()).slice(-2),
            hh = d.getHours(),
            h = hh,
            min = ('0' + d.getMinutes()).slice(-2),
            ampm = 'AM',
            time;

        if (hh > 12) {
            h = hh - 12;
            ampm = 'PM';
        } else if (hh === 12) {
            h = 12;
            ampm = 'PM';
        } else if (hh == 0) {
            h = 12;
        }

        // ie: 2013-02-18, 8:35 AM
        time = yyyy + '-' + mm + '-' + dd + ', ' + h + ':' + min + ' ' + ampm;

        return time;
    };


    this.round = function (number, roundVal) {
        return (parseFloat(number)/1000).toFixed(roundVal);
    };


    this.passCount = function () {
        var passCount = 0;
        for (var i in this.results) {
            var result = this.results[i];
            if (result.passed) {passCount++};
        }
        return passCount;
    };


    this.pendingCount = function () {
        var pendingCount = 0;
        for (var i in this.results) {
            var result = this.results[i];
            if (result.pending) {pendingCount++};
        }
        return pendingCount;
    };


    this.failCount = function () {
        var failCount = 0;
        for (var i in this.results) {
            var result = this.results[i];
            if (!result.passed && !result.pending) {failCount++}
        }
        return failCount;
    };

    this.applySmartHighlight = function (line) {
        if (this.showSmartStackTraceHighlight) {
            if (line.indexOf('node_modules') > -1) {
                return 'greyout';
            }
            if (line.indexOf('  at ') === -1) {
                return '';
            }

            return 'highlight';
        }
        return true;
    };


    var results =[
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "a5c354bc8223cbb5df055205499453c6",
        "instanceId": 1726,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532344951378,
                "type": ""
            }
        ],
        "screenShotFile": "00b900ce-0007-0063-009a-00ca00d2005c.png",
        "timestamp": 1532344950152,
        "duration": 3848
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "43d160aa098ad4475bebe7a7c8fd0456",
        "instanceId": 1753,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532345155837,
                "type": ""
            }
        ],
        "screenShotFile": "00e8009f-00bc-0039-0020-00260018003d.png",
        "timestamp": 1532345154722,
        "duration": 3796
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "ac403e6e99b6cc0eb539f878a2133e50",
        "instanceId": 1831,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532347851281,
                "type": ""
            }
        ],
        "screenShotFile": "00b40058-00e6-000c-002e-003f00e400d7.png",
        "timestamp": 1532347848898,
        "duration": 5088
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "6efea19fefcc0611fbf2a58c6e7042b7",
        "instanceId": 1850,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532347913697,
                "type": ""
            }
        ],
        "screenShotFile": "00fe00eb-0050-00eb-0018-006d00f000bd.png",
        "timestamp": 1532347912491,
        "duration": 3813
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "156e602239f583afc0f5c413246889ce",
        "instanceId": 1873,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532347972668,
                "type": ""
            }
        ],
        "screenShotFile": "00200068-000d-00fb-009f-0052007900b9.png",
        "timestamp": 1532347971521,
        "duration": 3843
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "c6834086e7f9a93482d4c618583e440d",
        "instanceId": 1890,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532347987105,
                "type": ""
            }
        ],
        "screenShotFile": "00e400ca-00ca-00b0-0085-00f900300002.png",
        "timestamp": 1532347985815,
        "duration": 3849
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "ad46dc802f942bd507b38ada00047233",
        "instanceId": 1921,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [],
        "screenShotFile": "008c00c2-00de-00e6-002b-00bb003a00a4.png",
        "timestamp": 1532348211878,
        "duration": 4163
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "75dfb1478596b88a82ead5f70dcc9d6a",
        "instanceId": 1929,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [],
        "screenShotFile": "00ab0007-0011-0042-00f4-005f002b00b5.png",
        "timestamp": 1532348226637,
        "duration": 3892
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "8d73355f411f06f654581603c2a4e8a3",
        "instanceId": 1940,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532348282964,
                "type": ""
            }
        ],
        "screenShotFile": "00960040-004e-0093-006f-009700e90040.png",
        "timestamp": 1532348280693,
        "duration": 5002
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "f05328e78082c37bfb11bcfb41c8cb46",
        "instanceId": 1967,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532348302127,
                "type": ""
            }
        ],
        "screenShotFile": "00c30074-0054-006c-001b-0084003a0040.png",
        "timestamp": 1532348299852,
        "duration": 4914
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "150f069a20b47e9156dae5c27c21a4e9",
        "instanceId": 1986,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532348329968,
                "type": ""
            }
        ],
        "screenShotFile": "00350072-0084-0010-0010-00ce00e10018.png",
        "timestamp": 1532348328840,
        "duration": 3662
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "os": "Mac OS X",
        "sessionId": "dd04c1f7b9849982a1f64631ac765039",
        "instanceId": 2005,
        "browser": {
            "name": "chrome",
            "version": "67.0.3396.99"
        },
        "message": "Passed",
        "browserLogs": [
            {
                "level": "WARNING",
                "message": "http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html - This page includes a password or credit card input in a non-secure context. A warning has been added to the URL bar. For more information, see https://goo.gl/zmWq3m.",
                "timestamp": 1532348343742,
                "type": ""
            }
        ],
        "screenShotFile": "00300040-00ec-00f6-00fc-006600a700a4.png",
        "timestamp": 1532348342571,
        "duration": 3746
    },
    {
        "description": "THis is also NonAng example|This is NonAng example",
        "passed": true,
        "pending": false,
        "sessionId": "aea33973-afa0-e44e-b18c-9621eaeff6de",
        "instanceId": 2031,
        "browser": {
            "name": "firefox"
        },
        "message": "Passed",
        "browserLogs": [],
        "screenShotFile": "0020003c-007d-00c4-0017-0028000e0005.png",
        "timestamp": 1532348403043,
        "duration": 6744
    }
];

    this.sortSpecs = function () {
        this.results = results.sort(function sortFunction(a, b) {
    if (a.sessionId < b.sessionId) return -1;else if (a.sessionId > b.sessionId) return 1;

    if (a.timestamp < b.timestamp) return -1;else if (a.timestamp > b.timestamp) return 1;

    return 0;
});
    };

    this.sortSpecs();
});

app.filter('bySearchSettings', function () {
    return function (items, searchSettings) {
        var filtered = [];
        var prevItem = null;

        for (var i = 0; i < items.length; i++) {
            var item = items[i];
            item.displaySpecName = false;

            countLogMessages(item);

            var hasLog = searchSettings.withLog && item.browserLogs && item.browserLogs.length > 0;
            if (searchSettings.description === '' ||
                (item.description && item.description.toLowerCase().indexOf(searchSettings.description.toLowerCase()) > -1)) {

                if (searchSettings.passed && item.passed || hasLog) {
                    checkIfShouldDisplaySpecName(prevItem, item);
                    filtered.push(item);
                    var prevItem = item;
                } else if (searchSettings.failed && !item.passed && !item.pending || hasLog) {
                    checkIfShouldDisplaySpecName(prevItem, item);
                    filtered.push(item);
                    var prevItem = item;
                } else if (searchSettings.pending && item.pending || hasLog) {
                    checkIfShouldDisplaySpecName(prevItem, item);
                    filtered.push(item);
                    var prevItem = item;
                }

            }
        }

        return filtered;
    };
});

var checkIfShouldDisplaySpecName = function (prevItem, item) {
    if (!prevItem) {
        item.displaySpecName = true;
        return;
    }

    if (getSpec(item.description) != getSpec(prevItem.description)) {
        item.displaySpecName = true;
        return;
    }
};

var getSpec = function (str) {
    var describes = str.split('|');
    return describes[describes.length-1];
};

var countLogMessages = function (item) {
    if ((!item.logWarnings || !item.logErrors) && item.browserLogs && item.browserLogs.length > 0) {
        item.logWarnings = 0;
        item.logErrors = 0;
        for (var logNumber = 0; logNumber < item.browserLogs.length; logNumber++) {
            var logEntry = item.browserLogs[logNumber];
            if (logEntry.level === 'SEVERE') {
                item.logErrors++;
            }
            if (logEntry.level === 'WARNING') {
                item.logWarnings++;
            }
        }
    }
};