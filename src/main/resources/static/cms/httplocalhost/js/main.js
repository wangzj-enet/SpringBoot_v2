/**
 * 通用模块
 *
 */
var $win = $(window),
	$doc = $(document),
	$body = $('body', $doc);

/**
 * 图片加载
 */
$(function () {
	if (!$.fn.lazyload) return;
	$("img.lazy", $body).lazyload({
		effect: "fadeIn",
		threshold: 200
	});
});


$(function() {
	$('.navpc', $body).on('mouseenter', '.level > li,.level-2 > li', function(event) {
		event.preventDefault();
		if ($(this).parent('.level-2').length) {
			$(this).children('ul').show();
		} else {
			$(this).children('ul').stop().hide().slideDown();
		}
	}).on('mouseleave', '.level > li,.level-2 > li', function(event) {
		event.preventDefault();
		if ($(this).parent('.level-2').length) {
			$(this).children('ul').hide();
		} else {
			$(this).children('ul').stop().slideUp('fast');
		}
	});
});

/**
 * 折叠导航
 */
$(function () {

	$("#btn").click(function (e) {
		if (e && e.stopPropagation) {
			e.stopPropagation();
		} else {
			window.event.cancelBubble = true;
		}
		$(this).siblings(".list1").stop().slideToggle();
		$(this).toggleClass("active");
		$(".search-box").slideUp();
		$.smartScroll($('.header'), ".list1");
		$("body").toggleClass("fixed");
	});
});

//阻止导航条滚动的时候，底部内容也跟着滚动
$.smartScroll = function (container, selectorScrollable) {
	// 如果没有滚动容器选择器，或者已经绑定了滚动时间，忽略
	if (!selectorScrollable || container.data('isBindScroll')) {
		return;
	}

	// 是否是搓浏览器
	// 自己在这里添加判断和筛选
	var isSBBrowser;

	var data = {
		posY: 0,
		maxscroll: 0
	};

	// 事件处理
	container.on({
		touchstart: function (event) {
			var events = event.originalEvent.targetTouches[0] || event;
			// 先求得是不是滚动元素或者滚动元素的子元素
			var elTarget = $(event.target);

			if (!elTarget.length) {
				return;
			}

			var elScroll;

			// 获取标记的滚动元素，自身或子元素皆可
			if (elTarget.is(selectorScrollable)) {
				elScroll = elTarget;
			} else if ((elScroll = elTarget.parents(selectorScrollable)).length == 0) {
				elScroll = null;
			}

			if (!elScroll) {
				return;
			}

			// 当前滚动元素标记
			data.elScroll = elScroll;
			//      alert(elScroll);
			// 垂直位置标记
			data.posY = events.pageY;
			data.scrollY = elScroll.scrollTop();
			// 是否可以滚动
			data.maxscroll = elScroll[0].scrollHeight - elScroll[0].clientHeight;
		},
		touchmove: function (event) {
			// 如果不足于滚动，则禁止触发整个窗体元素的滚动
			if (data.maxscroll <= 0 || isSBBrowser) {
				// 禁止滚动
				event.preventDefault();
			}
			// 滚动元素
			var elScroll = data.elScroll;
			// 当前的滚动高度
			var scrollTop = elScroll.scrollTop();

			// 现在移动的垂直位置，用来判断是往上移动还是往下
			var events = event.originalEvent.changedTouches[0] || event;
			// 移动距离
			var distanceY = events.pageY - data.posY;

			if (isSBBrowser) {
				elScroll.scrollTop(data.scrollY - distanceY);
				elScroll.trigger('scroll');
				return;
			}

			// 上下边缘检测
			if (distanceY > 0 && scrollTop == 0) {
				// 往上滑，并且到头
				// 禁止滚动的默认行为
				event.preventDefault();
				return;
			}

			// 下边缘检测
			if (distanceY < 0 && (scrollTop + 1 >= data.maxscroll)) {
				// 往下滑，并且到头
				// 禁止滚动的默认行为
				event.preventDefault();
				return;
			}
		},
		touchend: function () {
			data.maxscroll = 0;
		}
	});

	// 防止多次重复绑定
	container.data('isBindScroll', true);
};



$(function () {
	var winW = $win.width();
	$(window).resize(function () {
		winW = $win.width();
	});

	$(document).on("click", function (e) {
		if (winW < 992) {
			if (e && e.stopPropagation) {
				//W3C取消冒泡事件
				e.stopPropagation();
			} else {
				//IE取消冒泡事件
				window.event.cancelBubble = true;
			}
			$("#btn").siblings(".list1").slideUp()
			$("#btn").removeClass("active");
			$(".search-box").slideUp();
		}
	});


	//查找按钮
	$(".find").click(function (e) {
		if (e && e.stopPropagation) {
			//W3C取消冒泡事件
			e.stopPropagation();
		} else {
			//IE取消冒泡事件
			window.event.cancelBubble = true;
		}
		$(".search-box").stop().slideToggle();
		if (winW < 992) {
			$("#btn").siblings(".list1").slideUp()
			$("#btn").removeClass("active");
		}
	});


	var list1 = $(".nav .list1");
	var list2 = $(".nav .list2");
	var list3 = $(".nav .list3");
	list1.children(".more").on("click", function (event) {
		event.stopPropagation();
		$(this).toggleClass("slide").children(".list2").slideToggle();
		$(this).addClass("active").siblings().removeClass("active");
		$(this).find(".active").removeClass("active");
	});
	list2.children(".more").on("click", function (event) {
		event.stopPropagation();
		$(this).toggleClass("slide").children(".list3").slideToggle();
		$(this).toggleClass("active").siblings().removeClass("active");
		$(this).find(".active").removeClass("active");
	});
});

/**
 * 首页 banner
 *
 */
$(function () {
	if (!$.fn.owlCarousel) return;
	$('#owl-index').owlCarousel({
		autoPlay: 5000,
		autoPlay: true,
		autoHeight: false,

		stopOnHover: false,
		lazyLoad: true,

		singleItem: true,
		slideSpeed: 300,
		autoPlay: true,
		navigation: false,
		navigationText: false,
		paginationSpeed: 400,
		transitionStyle: "fade",

		afterAction: function () {}
	});
});


// 视频
$(function () {
	var $box = $(".video", $body);
	if (!$box.length) return;

	$iframe = $box.find('.iframe'),
		url = $iframe.data('src') + '?rel=0&showinfo=0';

	$box.on('click', '.video-box a', function (event) {
		event.preventDefault();
		var me = $(this);

		me.parent().css({
			"opacity": "1",
			"background": "url('/tpl/en_skyjades/assets/js/jquery.fancybox/fancybox_loading@2x.gif') rgba(32, 44, 92, 0.6) no-repeat center"
		});
		var height = me.find('.img-responsive').length ? me.height() : $box.height();
		height = Math.max(height, 170);
		if (!$iframe.attr('src')) $iframe.attr('src', url);
		$iframe.height(height);
		$iframe.css('display', 'block');
		me.hide();
	});
});



//首页视频
$(function () {
	var $box = $(".index-video", $body);
	if (!$box.length) return;

	$iframe = $box.find('.iframe'),
		url = $iframe.data('src') + '?rel=0&showinfo=0';

	$box.on('click', '.video-box a', function (event) {
		event.preventDefault();
		var me = $(this);
		if ($win.width() > 1200) {
			$.fancybox.open([url], {
				type: 'iframe',
				padding: 10,
			});
		} else {
			var height = me.find('.img-responsive').length ? me.height() : $box.height();
			height = Math.max(height, 170);
			if (!$iframe.attr('src')) $iframe.attr('src', url);
			$iframe.height(height);
			$iframe.css('display', 'block');
			me.hide();
		}
	});
});



$(function () {
	//页面超出banner改变logo
	var topNum = $("#banner").height();
	var logo = $("img", ".logo");
	var oheader = $(".header");
	$win.on("scroll", function () {
		var scroll = $win.scrollTop();
		if (scroll >= topNum) {
			logo.attr("th:src", "@{static/cms/httplocalhost/img/logo2.png");
			logo.attr("src", "static/cms/httplocalhost/img/logo2.png");
			oheader.addClass("out-header");
		} else {
			logo.attr("th:src", "@{static/cms/httplocalhost/img/logo.png")
			logo.attr("src", "static/cms/httplocalhost/img/logo.png")
			oheader.removeClass("out-header");
		}
	});
});



//首页轮播图
$(function () {
	if (!$.fn.owlCarousel) return;
	$('#owl-carousel-feedback').owlCarousel({
		navigation: false,
		navigationText: false,

		pagination: true,
		paginationSpeed: 400,

		slideSpeed: 300,
		singleItem: false,

		items: 3,
		itemsDesktop: [1199, 3],
		itemsDesktopSmall: [991, 2],
		itemsTablet: [768, 1],
		itemsTabletSmall: [480, 1],
		itemsMobile: [320, 1],

		autoPlay: 5500,
		lazyLoad: true,

		autoHeight: true,
		stopOnHover: true,
		rewindNav: false,

		afterInit: function () {}
	});
});

$(function() {
    if (!$.fn.imagezoom) return;
    $(".jqzoom").imagezoom();
});


//首页数字滚动
$(function () {
	if (!$.fn.countTo) return;
	var $timer = $('.box-timer'),
		height = $win.height();

		if (!$timer.length) return;

	var scrollHandler = function (event) {
		var top = $timer.offset().top;
		if (top > ($win.scrollTop() + height)) return;

		$win.off('scroll', scrollHandler);
		$('.timer', $timer).countTo({
			formatter: function (value, options) {
				var num = value.toFixed(options.decimals);
				return thousandBitSeparator(num);
			}
		});
	};

	$win.on('scroll', scrollHandler);


	// 千位分隔符
	function thousandBitSeparator(num) {
		return (num || 0).toString().replace(/(\d)(?=(?:\d{3})+$)/g, '$1,');
	}
});

$(function () {
	if (!$.fn.owlCarousel) return;
	$('#owl-carousel-client').owlCarousel({
		navigation: true,
		navigationText: false,

		pagination: true,
		paginationSpeed: 400,

		slideSpeed: 300,
		singleItem: false,

		items: 4,
		itemsDesktop: [1199, 4],
		itemsDesktopSmall: [991, 3],
		itemsTablet: [768, 2],
		itemsTabletSmall: [480, 1],
		itemsMobile: [320, 1],

		autoPlay: 5500,
		lazyLoad: true,

		autoHeight: true,
		stopOnHover: true,
		rewindNav: false,

		afterInit: function () {}
	});
})



//关于我们 团队滚动轮播
$(function () {
	if (!$.fn.owlCarousel) return;
	$('#owl-carousel-client1').owlCarousel({
		navigation: false,
		navigationText: false,

		pagination: true,
		paginationSpeed: 400,

		slideSpeed: 300,
		singleItem: false,

		items: 4,
		itemsDesktop: [1199, 4],
		itemsDesktopSmall: [991, 3],
		itemsTablet: [768, 2],
		itemsTabletSmall: [480, 1],
		itemsMobile: [320, 1],

		autoPlay: 5500,
		lazyLoad: true,

		autoHeight: true,
		stopOnHover: true,
		rewindNav: false,

		afterInit: function () {}
	});
});


//关于我们证书弹出显示
$(function () {
	if (!$.fn.fancybox) return;
	$("[rel=fancybox-product]").fancybox({
		'overlayShow': true,
		'overlayColor': '#000',
		'overlayOpacity': 0.9,
		'opacity': 0.5,
		'transitionIn': 'elastic',
		'transitionOut': 'none',
		'titlePosition': 'over',
		'titleFormat': function (title, currentArray, currentIndex, currentOpts) {
			return '<span id="fancybox-title-over">' + (currentIndex + 1) + ' / ' + currentArray.length + (title.length ? ' &nbsp; ' + title : '') + ' </span>';
		}
	});
});



//FAQ
$(function () {
	var q = $("li", "#faq");
	q.on("click", "h3", function () {
		var thisParent = $(this).parent().siblings();
		thisParent.children("p").slideUp();
		thisParent.children("h3").removeClass("active");
		$(this).toggleClass("active").siblings("p").stop().slideToggle(300);
	});

	//询价 滑动锚点
	$("#inquiry").on("click", function () {
		$("html,body").animate({
			scrollTop: $("#inquiry-form").offset().top - 250
		}, 500)
	});



	//返回顶部按钮
	$("#gotop").click(function () {
		$("html,body").animate({
			scrollTop: 0
		}, 500)
	});

	//分类下拉菜单

	$(".menu1").on("mouseenter", "li", function () {
		$(this).addClass("active").siblings().removeClass("active");
		$(this).children(".menu2").stop().slideDown();
		$(this).siblings().children(".menu2").stop().slideUp();
	});


});



$(function () {
	$('.feedback-form,.feedback-form-inquire').on('click', 'a.submit', function (event) {
		event.preventDefault();
		var jForm = $(event.delegateTarget),
			jThis = $(this);
		if (jThis.hasClass('disabled')) {
			// alert('正在提交，请稍后...');
			alert('please wait...');
			return;
		}

		var reg_email = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
		var data = {
			email: $('input[name="email"]', jForm).val().trim(),
			title: $('input[name="title"]', jForm).val().trim(),
			content: $('textarea[name="content"]', jForm).val().trim()
		};

		if (!data.email || !reg_email.test(data.email)) {
			alert('Please enter a valid email address');
			// alert('请输入一个有效的邮箱地址');
			$('input[name="email"]', jForm).focus();
			return false;
		} else if (!data.title) {
			alert('The title cannot be empty');
			// alert('请输入留言主题');
			$('input[name="title"]', jForm).focus();
			return false;
		} else if (!data.content) {
			alert('The message cannot be empty');
			// alert('请输入留言内容');
			$('textarea[name="content"]', jForm).focus();
			return false;
		}

		jThis.text($(this).data('text-b')).css({
			opacity: '.5'
		}).addClass('disabled');


		// event.preventDefault();
		// var data = $(this).serializeArray();
		// $.get(, data, function (data) {
		//  /*optional stuff to do after success */
		// }, 'json');

		if (jForm.hasClass('feedback-form-inquire')) {
			var url = '/index.php?c=cart&f=sendMessage&t=' + new Date().getTime();
		} else {
			var url = '/api/sendMail';
		}

		$.ajax({
			'url': url,
			'data': jForm.serializeArray(),
			'type': 'post',
			'dataType': 'json',
			'success': function (rs) {

				jThis.text(jThis.data('text')).css({
					opacity: '1'
				}).removeClass('disabled');
				if (rs == '1'||rs.status == '1'||rs.status == '0k') {
					alert('Your message has been posted, please wait patiently administrator audit, thank you for your submission');
					// alert('您的留言已提交,请耐心等候管理员回复');
					if (jForm.hasClass('feedback-form-inquire')) {
						location.href = '/product.html';
					} else {
						jForm.get(0).reset();
					}
				} else {
					alert(rs);
					return false;
				}
			}
		});
		return false;
	});
});
